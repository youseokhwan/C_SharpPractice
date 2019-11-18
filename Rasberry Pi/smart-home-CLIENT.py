import os
import paho.mqtt.client as mqtt
import picamera
import time
import Adafruit_DHT as dht
import json
import RPi.GPIO as GPIO
from RPLCD.i2c import CharLCD

GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(16, GPIO.OUT)  # LED Red
GPIO.setup(12, GPIO.IN, pull_up_down=GPIO.PUD_UP)  # Button
GPIO.setup(24, GPIO.IN)  # PIR
GPIO.setup(25, GPIO.IN)  # Buzzer
GPIO.setup(25, GPIO.OUT)  # Buzzer

lcd = CharLCD("PCF8574", 0x27)
camera = picamera.PiCamera()
camera.resolution = (2592, 1944)
intrusion_control = 0
timer = 0
dht_type = 11  # DHT 타입
bcm_pin = 23  # 핀 번호

MQTT_HOST = "192.168.219.103"
MQTT_PORT = 1883
MQTT_KEEPALIVE_INTERVAL = 60
MQTT_TOPIC = "dht/CCL"

def on_publish(client, userdata, mid):
    print("Message Published...")

def on_connect(client, userdata, flags, rc):
    print("Connect with result code" + str(rc))
    client.subscribe("dht/CCL")

def on_message(client, userdata, msg):
    print(msg.topic + " " + str(msg.payload.decode('utf-8')))
    if msg.payload.decode('utf-8') == "비상등을 켜세요":
        GPIO.output(16, True)
    elif msg.payload.decode('utf-8') == "비상등을 끄세요":
        GPIO.output(16, False)
    elif msg.payload.decode('utf-8') == "Camera On!":
        camera.capture("theif.jpg")
        os.system("xdg-open theif.jpg")

client = mqtt.Client()
client.on_publish = on_publish
client.on_connect = on_connect
client.on_message = on_message

client.connect(MQTT_HOST, MQTT_PORT, MQTT_KEEPALIVE_INTERVAL)
client.loop_start()

def buzz():
    pitch = 1000
    duration = 0.1
    period = 1.0 / pitch
    delay = period / 2
    cycles = int(duration * pitch)
    for i in range(cycles):
        GPIO.output(25, True)
        time.sleep(delay)
        GPIO.output(25, False)
        time.sleep(delay)

try:
    while True:
        if GPIO.input(24) == True:
            print("SENSOR ON!!")
            while True:
                buzz()
                GPIO.output(16, True)
                if intrusion_control == 0:  # 움직임이 감지되면 ...
                    lcd.clear()
                    # camera.capture("theif.jpg")
                    lcd.write_string('Intrusion')
                    lcd.crlf()
                    lcd.write_string('Detection')
                    # PC로 메시지 전송
                    client.publish(MQTT_TOPIC, str({'pir': "움직임이 감지됨!"}))
                    intrusion_control += 1
                if GPIO.input(12) == False:
                    print("button pressed")
                    lcd.clear()
                    GPIO.output(16, False)
                    intrusion_control = 0
                    time.sleep(2)
                    break
                time.sleep(0.3)
        else:
            GPIO.output(25, False)
            # GPIO.output(16, False)
            if timer > 1:
                timer = 0
                lcd.clear()
                humidity, temperature = dht.read_retry(dht_type, bcm_pin)
                humid = round(humidity, 1)
                temp = round(temperature, 1)
                print(temp, humid)
                lcd.write_string('TEMP ')
                lcd.write_string(str(temp))
                lcd.write_string('C ')
                lcd.crlf()
                lcd.write_string('HUMID ')
                lcd.write_string(str(humid))
                lcd.write_string('% ')
                # pc에 전송
                data = { 'temperature': temp, 'humidity': humid, 'pir': "false" }
                client.publish(MQTT_TOPIC, str(data))
            timer += 0.2
            time.sleep(0.2)
except KeyboardInterrupt:
    lcd.clear()
    GPIO.cleanup()
finally:
    lcd.clear()
    GPIO.cleanup()


