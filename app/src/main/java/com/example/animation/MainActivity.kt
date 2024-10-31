package com.example.animation

import android.content.Intent
import android.os.Bundle
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val buttonStart = findViewById<Button>(R.id.buttonStart)

        val imageAnimation = TranslateAnimation(0f, 0f, -500f, 0f).apply {
            duration = 2000
        }
        imageView.startAnimation(imageAnimation)

        val buttonAnimation = TranslateAnimation(-500f, 0f, 0f, 0f).apply {
            duration = 2000
        }
        buttonStart.startAnimation(buttonAnimation)

        buttonStart.setOnClickListener {
            startActivity(Intent(this, RegistrationActivity::class.java))
        }
    }
}
