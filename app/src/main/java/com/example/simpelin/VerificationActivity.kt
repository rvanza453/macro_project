package com.example.simpelin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class VerificationActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification)

        val btnForgotPassActivity: Button = findViewById(R.id.btn_verify)
        btnForgotPassActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                R.id.btn_verify -> {
                    val intent = Intent(this@VerificationActivity, ResetPassActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}