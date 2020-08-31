package com.example.calculator

import android.content.Intent
import android.content.pm.ActivityInfo
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

        // btnMode Click 이벤트
        btnMode.setOnClickListener {
            // Orientation 변경
            requestedOrientation = if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            } else {
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            }

            // TODO - 버튼을 통해 Orientation을 변경하더라도 다시 센서 감지를 할 수 있도록 구현해야 함
            // 다시 Orientation 센서를 활성화 하는 코드 : requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
        }

        // 기기의 Orientation에 따른 Button Visibility 설정
        // TODO - 모드 변경 시 tooltip을 바꿔야하므로 추후 onConfigurationChanged 메서드로 통합하기
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