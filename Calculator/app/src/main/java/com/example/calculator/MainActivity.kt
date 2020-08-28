package com.example.calculator

import android.content.Intent
import android.content.res.Configuration
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        // 첫 번째 줄 키패드 버튼 추가
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rowMain0.addView(CalcButton(createIntegerId("btnMainChange"), "⇆"  , "대체 함수", applicationContext).button)
            rowMain0.addView(CalcButton(createIntegerId("btnMainRad"   ), "Rad", "라디안"  , applicationContext).button)
            rowMain0.addView(CalcButton(createIntegerId("btnMainRoot"  ), "√"  , "제곱근"  , applicationContext).button)
        }
        rowMain0.addView(CalcButton(createIntegerId("btnMainClear"  ), "C" , "초기화", applicationContext).button)
        rowMain0.addView(CalcButton(createIntegerId("btnMainBracket"), "()", "괄호" , applicationContext).button)
        rowMain0.addView(CalcButton(createIntegerId("btnMainPercent"), "%" , "퍼센트", applicationContext).button)
        rowMain0.addView(CalcButton(createIntegerId("btnMainDiv"    ), "÷" , "나누기", applicationContext).button)

        // 두 번째 줄 키패드 버튼 추가
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rowMain1.addView(CalcButton(createIntegerId("btnMainSin"), "sin", "사인" , applicationContext).button)
            rowMain1.addView(CalcButton(createIntegerId("btnMainCos"), "cos", "코사인", applicationContext).button)
            rowMain1.addView(CalcButton(createIntegerId("btnMainTan"), "tan", "탄젠트", applicationContext).button)
        }
        rowMain1.addView(CalcButton(createIntegerId("btnMain7"  ), "7", null  , applicationContext).button)
        rowMain1.addView(CalcButton(createIntegerId("btnMain8"  ), "8", null  , applicationContext).button)
        rowMain1.addView(CalcButton(createIntegerId("btnMain9"  ), "9", null  , applicationContext).button)
        rowMain1.addView(CalcButton(createIntegerId("btnMainMul"), "×", "곱하기", applicationContext).button)

        // 세 번째 줄 키패드 버튼 추가
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rowMain2.addView(CalcButton(createIntegerId("btnMainLn" ), "ln" , "자연 로그", applicationContext).button)
            rowMain2.addView(CalcButton(createIntegerId("btnMainLog"), "log", "대수"    , applicationContext).button)
            rowMain2.addView(CalcButton(createIntegerId("btnMainInv"), "1/x", "역수"    , applicationContext).button)
        }
        rowMain2.addView(CalcButton(createIntegerId("btnMain4"  ), "4", null  , applicationContext).button)
        rowMain2.addView(CalcButton(createIntegerId("btnMain5"  ), "5", null  , applicationContext).button)
        rowMain2.addView(CalcButton(createIntegerId("btnMain6"  ), "6", null  , applicationContext).button)
        rowMain2.addView(CalcButton(createIntegerId("btnMainSub"), "-", "나누기", applicationContext).button)

        // 네 번째 줄 키패드 버튼 추가
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rowMain3.addView(CalcButton(createIntegerId("btnMainESupX"), "ex", "오일러의 수의 거듭제곱", applicationContext).button)
            rowMain3.addView(CalcButton(createIntegerId("btnMainXSup2"), "x2", "x의 제곱"          , applicationContext).button)
            rowMain3.addView(CalcButton(createIntegerId("btnMainXSupY"), "xy", "x의 y제곱"         , applicationContext).button)
        }
        rowMain3.addView(CalcButton(createIntegerId("btnMain1"  ), "1", null  , applicationContext).button)
        rowMain3.addView(CalcButton(createIntegerId("btnMain2"  ), "2", null  , applicationContext).button)
        rowMain3.addView(CalcButton(createIntegerId("btnMain3"  ), "3", null  , applicationContext).button)
        rowMain3.addView(CalcButton(createIntegerId("btnMainAdd"), "+", "더하기", applicationContext).button)

        // 다섯 번째 줄 키패드 버튼 추가
        if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rowMain4.addView(CalcButton(createIntegerId("btnMainAbs"), "|x|", "절댓값"    , applicationContext).button)
            rowMain4.addView(CalcButton(createIntegerId("btnMainPi" ), "π"  , "Pi"      , applicationContext).button)
            rowMain4.addView(CalcButton(createIntegerId("btnMainE"  ), "e"  , "오일러의 수", applicationContext).button)
        }
        rowMain4.addView(CalcButton(createIntegerId("btnMainSign"), "+/-", null , applicationContext).button)
        rowMain4.addView(CalcButton(createIntegerId("btnMain0"   ), "0"  , null , applicationContext).button)
        rowMain4.addView(CalcButton(createIntegerId("btnMainDot" ), "."  , null , applicationContext).button)
        rowMain4.addView(CalcButton(createIntegerId("btnMainCalc"), "="  , "계산", applicationContext).button)
    }

    // 입력받은 Id(String) 값을 R.id 형태의 Int로 생성
    private fun createIntegerId(id: String): Int {
        return resources.getIdentifier(id, "id", packageName)
    }
}