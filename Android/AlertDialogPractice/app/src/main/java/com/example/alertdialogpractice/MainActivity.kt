package com.example.alertdialogpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDelete.setOnClickListener {
            DeleteDialog().show(supportFragmentManager, "delete")
        }

        btnColor.setOnClickListener {
            ColorDialog().show(supportFragmentManager, "color")
        }

        btnLogin.setOnClickListener {
            LoginDialog().show(supportFragmentManager, "login")
        }
    }
}