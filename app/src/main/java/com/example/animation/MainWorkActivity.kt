package com.example.animation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AlphaAnimation
import android.widget.TextView

class MainWorkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_work)

        val textView = findViewById<TextView>(R.id.textView)

        val textAnimation = AlphaAnimation(0f, 1f).apply {
            duration = 2000
        }
        textView.startAnimation(textAnimation)
    }
}
