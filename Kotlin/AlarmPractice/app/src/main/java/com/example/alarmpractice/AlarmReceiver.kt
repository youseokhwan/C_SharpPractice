package com.example.alarmpractice

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.SharedPreferences
import android.widget.Toast
import androidx.core.app.NotificationCompat
import java.text.SimpleDateFormat
import java.util.*

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val notificationManager: NotificationManager = context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        val notificationIntent = Intent(context, MainActivity::class.java)
        notificationIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP

        val pendingIntent = PendingIntent.getActivity(context, 0, notificationIntent, 0)
        val builder: NotificationCompat.Builder = NotificationCompat.Builder(context!!, "default")

        builder.setSmallIcon(R.drawable.ic_launcher_foreground)
        val channelName = "AlarmChannel"
        val description = "매일 정해진 시간에 알람"
        val importance = NotificationManager.IMPORTANCE_HIGH

        val notificationChannel = NotificationChannel("default", channelName, importance)
        notificationChannel.description = description

        notificationManager.createNotificationChannel(notificationChannel)

        builder.setAutoCancel(true)
            .setDefaults(NotificationCompat.DEFAULT_ALL)
            .setWhen(System.currentTimeMillis())
            .setTicker("{Time to watch some cool stuff!}")
            .setContentTitle("상태바 드래그시 보이는 타이틀")
            .setContentText("상태바 드래그시 보이는 서브타이틀")
            .setContentInfo("INFO")
            .setContentIntent(pendingIntent)

        notificationManager.notify(1234, builder.build())

        val nextNotifyTime: Calendar = Calendar.getInstance()
        nextNotifyTime.add(Calendar.DATE, 1)

        val editor: SharedPreferences.Editor = context.getSharedPreferences("daily alarm", MODE_PRIVATE).edit()
        editor.putLong("nextNotifyTime", nextNotifyTime.timeInMillis)
        editor.apply()

        val currentDateTime: Date = nextNotifyTime.time
        val dateText = SimpleDateFormat("yyyy년 MM월 dd일 EE요일 a hh시 mm분", Locale.getDefault()).format(currentDateTime)

        Toast.makeText(context.applicationContext, "다음 알람은 " + dateText + "으로 설정되었습니다.", Toast.LENGTH_SHORT).show()
    }
}