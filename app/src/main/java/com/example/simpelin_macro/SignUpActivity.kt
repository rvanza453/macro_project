package com.example.simpelin_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class SignUpActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val btnSignup = findViewById<ImageButton>(R.id.btn_signup)
        btnSignup.setOnClickListener(this)

        val btnLogin = findViewById<TextView>(R.id.log_in)
        btnLogin.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_signup -> {
                val intent = Intent(this@SignUpActivity,LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.log_in -> {
                val intent = Intent(this@SignUpActivity,LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}