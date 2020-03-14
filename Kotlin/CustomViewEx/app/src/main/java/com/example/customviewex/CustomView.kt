package com.example.customviewex

import android.annotation.TargetApi
import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.view_my_custom.view.*

@TargetApi(Build.VERSION_CODES.LOLLIPOP) // 롤리팝 이전 버전에서 충돌을 막기 위해 정의
class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {
    init { // 주 생성자의 부분으로 초기화되어야 할 코드를 작성
        LayoutInflater.from(context).inflate(R.layout.view_my_custom, this, true)
        orientation = VERTICAL

        attrs?.let { // 코틀린의 표준 함수 let을 사용
            //속성을 리소스에서 읽어 옴
            val typedArray = context.obtainStyledAttributes(
                it, // attrs 객체를 가리킴
                R.styleable.CustomView,
                0,
                0
            )
            val title = resources.getText(typedArray
                .getResourceId(
                    R.styleable.CustomView_my_custom_title,
                    R.string.view_title1
                ))
            // 리소스 id에 값 지정
            my_title.text = title
            my_edit.hint = resources.getString(R.string.hint_text)

            typedArray.recycle() // typedArray의 재사용
        }
    }
}