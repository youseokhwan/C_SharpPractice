package com.example.workmanagerpractice

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

// Worker를 상속받아 작업 내용을 정의한 클래스
class SimpleWorker(appContext: Context, workerParams: WorkerParameters) :
    Worker(appContext, workerParams) {

    override fun doWork(): Result {

        // 작업 내용 정의
        Log.d("TestLog", "doWork()가 실행됨")

        return Result.success()
    }
}