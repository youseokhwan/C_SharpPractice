package com.example.crossfade

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var duration: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // duration 설정
        duration = resources.getInteger(android.R.integer.config_shortAnimTime).toLong()

        // switch 변경 이벤트
        show.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                textView.apply {
                    alpha = 0f
                    visibility = View.VISIBLE

                    animate().alpha(1f)
                            .setDuration(duration)
                            .setListener(null)
                }

                progressBar.animate()
                        .alpha(0f)
                        .setDuration(duration)
                        .setListener(object : AnimatorListenerAdapter() {
                            override fun onAnimationEnd(animation: Animator?) {
                                progressBar.visibility = View.GONE
                            }
                        })
            } else {
                textView.animate()
                        .alpha(0f)
                        .setDuration(duration)
                        .setListener(object : AnimatorListenerAdapter() {
                            override fun onAnimationEnd(animation: Animator?) {
                                textView.visibility = View.GONE
                            }
                        })

                progressBar.apply {
                    alpha = 0f
                    visibility = View.VISIBLE

                    animate().alpha(1f)
                            .setDuration(duration)
                            .setListener(null)
                }
            }
        }
    }
}