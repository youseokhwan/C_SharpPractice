package com.example.alarmpractice

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timePicker.setIs24HourView(true)

        val sharedPreferences = getSharedPreferences("daily alarm", Context.MODE_PRIVATE)
        val mills = sharedPreferences.getLong("nextNotifyTime", Calendar.getInstance().timeInMillis)

        val nextNotifyTime: Calendar = GregorianCalendar()
        nextNotifyTime.timeInMillis = mills

        val nextDate: Date = nextNotifyTime.time
        val dateText = SimpleDateFormat("yyyy년 MM월 dd일 EE요일 a hh시 mm분", Locale.getDefault()).format(nextDate)

        Toast.makeText(applicationContext, "[처음 실행시] 다음 알람은 " + dateText + "으로 설정되었습니다.", Toast.LENGTH_SHORT).show()

        val currentTime: Date = nextNotifyTime.time
        val hourFormat: SimpleDateFormat = SimpleDateFormat("kk", Locale.getDefault())
        val minuteFormat: SimpleDateFormat = SimpleDateFormat("mm", Locale.getDefault())

        val preHour = hourFormat.format(currentTime).toInt()
        val preMinute = minuteFormat.format(currentTime).toInt()

        timePicker.hour = preHour
        timePicker.minute = preMinute

        button.setOnClickListener {
            var hour = 0
            var amPm = ""
            val hour24 = timePicker.hour
            val minute = timePicker.minute

            if (hour24 > 12) {
                amPm = "PM"
                hour = hour24 - 12
            } else {
                hour = hour24
                amPm = "AM"
            }

            val calendar = Calendar.getInstance()
            calendar.timeInMillis = System.currentTimeMillis()
            calendar.set(Calendar.HOUR_OF_DAY, hour24)
            calendar.set(Calendar.MINUTE, minute)
            calendar.set(Calendar.SECOND, 0)

            if (calendar.before(Calendar.getInstance())) {
                calendar.add(Calendar.DATE, 1)
            }

            val currentDateTime = calendar.time
            val dateText = SimpleDateFormat("yyyy년 MM월 dd일 EE요일 a hh시 mm분 ", Locale.getDefault()).format(currentDateTime)

            Toast.makeText(applicationContext, dateText + "으로 알람이 설정되었습니다.", Toast.LENGTH_SHORT).show()

            val editor = getSharedPreferences("daily alarm", Context.MODE_PRIVATE).edit()
            editor.putLong("nextNotifyTime", calendar.timeInMillis)
            editor.apply()

            diaryNotification(calendar)
        }
    }

    private fun diaryNotification(calendar: Calendar) {
        val dailyNotify = true

        val packageManager = this.packageManager
        val receiver = ComponentName(this, DeviceBootReceiver::class.java)
        val alarmIntent = Intent(this, AlarmReceiver::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this, 0, alarmIntent, 0)
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        if (dailyNotify) {
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent)
            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
            packageManager.setComponentEnabledSetting(receiver, PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP)
        }
    }
}
