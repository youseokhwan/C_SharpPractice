package com.example.alarmmanager

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val notificationManager = context?.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel = NotificationChannel(
                "alarm",
                "AlarmChannel",
                NotificationManager.IMPORTANCE_DEFAULT
            ).apply {
                description = "description"
            }

            notificationManager.createNotificationChannel(channel)
        }

        val builder = NotificationCompat.Builder(context, "alarm")
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("AlarmManager")
            .setContentText("AlarmManager를 통해 발생한 Notification")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(context)) {
            notify(0, builder.build())
        }
    }
}