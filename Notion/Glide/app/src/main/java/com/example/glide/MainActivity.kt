package com.example.glide

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageUrl = "https://github.com/bumptech/glide/blob/master/static/glide_logo.png?raw=true"
        val gifImageUrl = "https://media.giphy.com/media/Lmy23L3RkJ0sEWokRN/giphy.gif"

        // 일반 Image
        Glide.with(this)
            .load(imageUrl)
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .skipMemoryCache(true)
            .placeholder(ColorDrawable(Color.GREEN))
            .error(ColorDrawable(Color.RED))
            .transition(withCrossFade(500))
            .into(imageView)

        // Gif Image
        Glide.with(this)
            .asGif()
            .load(gifImageUrl)
            .into(imageView)
    }
}