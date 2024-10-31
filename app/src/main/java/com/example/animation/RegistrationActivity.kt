package com.example.animation

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationSet
import android.view.animation.AlphaAnimation
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val title = findViewById<TextView>(R.id.title)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val registerButton = findViewById<Button>(R.id.registerButton)

        val titleAnimation = TranslateAnimation(0f, 0f, -500f, 0f).apply {
            duration = 2000
        }
        title.startAnimation(titleAnimation)

        val usernameAnimationSet = AnimationSet(true).apply {
            addAnimation(AlphaAnimation(0f, 1f).apply {
                duration = 2000
            })
            addAnimation(TranslateAnimation(0f, 0f, 500f, 0f).apply {
                duration = 2000
            })
        }
        username.startAnimation(usernameAnimationSet)

        val passwordAnimationSet = AnimationSet(true).apply {
            addAnimation(AlphaAnimation(0f, 1f).apply {
                duration = 2000
            })
            addAnimation(TranslateAnimation(0f, 0f, 500f, 0f).apply {
                duration = 2000
            })
        }
        password.startAnimation(passwordAnimationSet)

        val registerButtonAnimationSet = AnimationSet(true).apply {
            addAnimation(AlphaAnimation(0f, 1f).apply {
                duration = 2000
            })
            addAnimation(TranslateAnimation(0f, 0f, 500f, 0f).apply {
                duration = 2000
            })
        }
        registerButton.startAnimation(registerButtonAnimationSet)

        registerButton.setOnClickListener {
            startActivity(Intent(this, MainWorkActivity::class.java))
        }
    }
}

