package com.example.calculator

import android.content.Context
import android.widget.Button

/**
 * 키패드에서 사용할 Button 정의
 * @param id
 * @param text
 * @param hint
// * @param backgroundColor
// * @param textColor
 */
class CalcButton(id: Int,
                 text: String,
                 hint: String?,
//                 backgroundColor: Int,
//                 textColor: Int,
                 context: Context) {

    val button: Button = Button(context)
    var hint: String? = null

    init {
        this.button.id = id
        this.button.text = text
        this.hint = hint
//        this.button.setBackgroundColor(backgroundColor)
//        this.button.setTextColor(textColor)
    }
}