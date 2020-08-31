package com.example.calculator

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ActionBar 숨김
        supportActionBar?.hide()

        // edtExpression 클릭 시 키보드 올라오지 않도록 설정
        edtExpression.setTextIsSelectable(true)
        edtExpression.showSoftInputOnFocus = false

        // btnUnitConverter Click 이벤트
        btnUnitConverter.setOnClickListener {
            // 단위 계산기 Activity 호출
            startActivity(Intent(this, UnitConverterActivity::class.java))
        }

        // 기기의 Orientation에 따른 Button Visibility 설정
        setButtonsVisibility()
    }

    // 기기의 Orientation에 따른 Button Visibility 설정
    private fun setButtonsVisibility() {
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            btnMainSwitch.visibility = View.VISIBLE
            btnMainRad   .visibility = View.VISIBLE
            btnMainRoot  .visibility = View.VISIBLE
            btnMainSin   .visibility = View.VISIBLE
            btnMainCos   .visibility = View.VISIBLE
            btnMainTan   .visibility = View.VISIBLE
            btnMainLn    .visibility = View.VISIBLE
            btnMainLog   .visibility = View.VISIBLE
            btnMainInv   .visibility = View.VISIBLE
            btnMainESupX .visibility = View.VISIBLE
            btnMainXSup2 .visibility = View.VISIBLE
            btnMainXSupY .visibility = View.VISIBLE
            btnMainAbs   .visibility = View.VISIBLE
            btnMainPi    .visibility = View.VISIBLE
            btnMainEuler .visibility = View.VISIBLE
        } else {
            btnMainSwitch.visibility = View.GONE
            btnMainRad   .visibility = View.GONE
            btnMainRoot  .visibility = View.GONE
            btnMainSin   .visibility = View.GONE
            btnMainCos   .visibility = View.GONE
            btnMainTan   .visibility = View.GONE
            btnMainLn    .visibility = View.GONE
            btnMainLog   .visibility = View.GONE
            btnMainInv   .visibility = View.GONE
            btnMainESupX .visibility = View.GONE
            btnMainXSup2 .visibility = View.GONE
            btnMainXSupY .visibility = View.GONE
            btnMainAbs   .visibility = View.GONE
            btnMainPi    .visibility = View.GONE
            btnMainEuler .visibility = View.GONE
        }
    }
}