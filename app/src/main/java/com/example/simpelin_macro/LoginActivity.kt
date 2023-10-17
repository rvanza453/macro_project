package com.example.simpelin_macro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<ImageButton>(R.id.btn_login)
            btnLogin.setOnClickListener(this)

        val btnSignup = findViewById<TextView>(R.id.btn_signup)
            btnSignup.setOnClickListener(this)

        val btnForgot = findViewById<TextView>(R.id.btn_forgotpass)
            btnForgot.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_login -> {
                val intent = Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_signup -> {
                val intent = Intent(this@LoginActivity,SignUpActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_forgotpass -> {
                val intent = Intent(this@LoginActivity,ForgotPassActivity::class.java)
                startActivity(intent)
            }
        }
    }
}