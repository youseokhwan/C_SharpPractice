package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { // 안드로이드 하위 호환성을 위한 액티비티 클래스를 상속

    override fun onCreate(savedInstanceState: Bundle?) { // 생명주기의 하나인 콜백 함수
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
