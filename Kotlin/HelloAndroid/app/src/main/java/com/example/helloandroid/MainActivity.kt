package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() { // 안드로이드 하위 호환성을 위한 액티비티 클래스를 상속

    override fun onCreate(savedInstanceState: Bundle?) { // 생명주기의 하나인 콜백 함수
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. 기존 findViewById 방식
//        val tvTitle = findViewById<TextView>(R.id.tv_title)
//        tvTitle.text = "Hello Kotlin!"

        // 2. 합성 프로퍼티 방식
        tv_title.text = "Hello Kotlin! again!~"

        // 3. 확장 함수 방식 - 호출 시 캐시된 정보를 읽기 때문에 빠르게 처리됨
        titleOn()
    }

}

fun MainActivity.titleOn() {
    tv_title.text = "Hi There!"
    tv_title.visibility = View.VISIBLE
}