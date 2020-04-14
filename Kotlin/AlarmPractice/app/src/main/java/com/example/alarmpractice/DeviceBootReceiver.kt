package com.example.alarmpractice

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.SharedPreferences
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class DeviceBootReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Objects.equals(intent?.action, "android.intent.action.BOOT_COMPLETED")) {
            val alarmIntent: Intent = Intent(context, AlarmReceiver::class.java)
            val pendingIntent: PendingIntent = PendingIntent.getBroadcast(context, 0, alarmIntent, 0)

            val alarmManager: AlarmManager = context?.getSystemService(Context.ALARM_SERVICE) as AlarmManager

            val sharedPreferences: SharedPreferences = context.getSharedPreferences("daily alarm", MODE_PRIVATE)
            val mills = sharedPreferences.getLong("nextNotifyTime", Calendar.getInstance().timeInMillis)

            val currentCalendar: Calendar = Calendar.getInstance()
            val nextNotifyTime: Calendar = GregorianCalendar()
            nextNotifyTime.timeInMillis = sharedPreferences.getLong("nextNotifyTime", mills)

            if (currentCalendar.after(nextNotifyTime)) {
                nextNotifyTime.add(Calendar.DATE, 1)
            }

            val currentDateTime: Date = nextNotifyTime.time
            val dateText = SimpleDateFormat("yyyy년 MM월 dd일 EE요일 a hh시 mm분", Locale.getDefault()).format(currentDateTime)

            Toast.makeText(context.applicationContext, "[재부팅] 다음 알람은 " + dateText + "으로 설정되었습니다.", Toast.LENGTH_SHORT).show()

            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, nextNotifyTime.timeInMillis, AlarmManager.INTERVAL_DAY, pendingIntent)
        }
    }
}