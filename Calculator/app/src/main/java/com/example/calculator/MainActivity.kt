package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ActionBar 숨김
        supportActionBar?.hide()

        // btnConverter Click 이벤트
        btnConverter.setOnClickListener {
            // 단위 계산기 Activity 호출
            startActivity(Intent(this, UnitConverterActivity::class.java))
        }
    }
}