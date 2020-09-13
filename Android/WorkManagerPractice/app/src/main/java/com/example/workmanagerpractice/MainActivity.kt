package com.example.workmanagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.work.Constraints
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTrigger.setOnClickListener {
            // 제약 조건 정의
            val constraints = Constraints.Builder()
                .setRequiresCharging(true) // 충전 중일 떄만 실행
                .build()

            val workRequest = OneTimeWorkRequestBuilder<SimpleWorker>()
                .setInitialDelay(5, TimeUnit.SECONDS) // 5초 딜레이
                .setConstraints(constraints) // 제약 조건 추가
                .build()

            WorkManager.getInstance().enqueue(workRequest) // 작업 시작
        }
    }
}