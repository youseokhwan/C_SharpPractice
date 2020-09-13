package com.example.alarmmanagerpractice

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        val alarmIntent = Intent(applicationContext, AlarmReceiver::class.java).let { intent ->
            PendingIntent.getBroadcast(applicationContext, 1, intent, 0)
        }
        val calendar = Calendar.getInstance().apply {
            timeInMillis = System.currentTimeMillis()
            set(Calendar.HOUR_OF_DAY, 22)
            set(Calendar.MINUTE, 29)
            set(Calendar.SECOND, 0)
        }

        btnStart.setOnClickListener {
            // 알람 시작
            alarmManager.setInexactRepeating(
                AlarmManager.RTC_WAKEUP,
                calendar.timeInMillis,
                AlarmManager.INTERVAL_FIFTEEN_MINUTES,
                alarmIntent
            )

            Toast.makeText(this, "AlarmManager Start", Toast.LENGTH_SHORT).show()
        }

        btnStop.setOnClickListener {
            // 알람 종료
            alarmManager.cancel(alarmIntent)

            Toast.makeText(this, "AlarmManager Stop", Toast.LENGTH_SHORT).show()
        }
    }
}