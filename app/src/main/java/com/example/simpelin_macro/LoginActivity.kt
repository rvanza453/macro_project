package com.example.simpelin_macro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<ImageButton>(R.id.btn_login)
            btnLogin.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_login -> {
                val intent = Intent(this@LoginActivity,MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}