package com.example.simpelin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ForgotPassActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)

        val btnForgotPassActivity: Button = findViewById(R.id.btn_recover)
        btnForgotPassActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_recover -> {
                    val intent = Intent(this@ForgotPassActivity, VerificationActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}