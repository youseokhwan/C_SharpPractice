package com.example.messageuithread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mHandler: Handler // 핸들러 선언
    lateinit var mThread: Thread
    private val START = 100 // 일종의 메시지의 종류를 나타내기 위한 구분 값(시작)
    private val COUNT = 101 // 일종의 메시지의 종류를 나타내기 위한 구분 값(카운트)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar.max = 100

        // 버튼 클릭 처리
        start_progress.setOnClickListener {
            if (!mThread.isAlive) {
                mHandler.sendEmptyMessage(START) // 카운트 시작 메시지 보내기
            }
        }

        // 일반 스레드의 작성
        mThread = Thread(Runnable {
            for (i in 0..100) {
                Thread.sleep(100)
                // 메시지의 구성
                val message = Message()
                message.what = COUNT // 메시지의 종류
                message.arg1 = i // 메시지의 값

                mHandler.sendMessage(message) // 카운트 값 메시지 보내기
            }
        })
    }

    override fun onResume() {
        super.onResume()
        mHandler = MyHandler(this) // 핸들러 생성
    }

    companion object {
        class MyHandler(private val activity: MainActivity) : Handler() { // 핸들러 정의
            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                if (msg.what == activity.START) {
                    // 일반 스레드의 시작
                    if (activity.mThread.state == Thread.State.NEW) {
                        activity.mThread.start()
                    } else if (msg.what == activity.COUNT) {
                        activity.progressBar.progress = msg.arg1
                        activity.tv_count.text = "Count " + msg.arg1 // UI의 갱신
                    }
                }
            }
        }
    }
}