package com.example.simpelin_macro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class ResetPassActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_pass)

        val btnContinue = findViewById<ImageButton>(R.id.btn_continue)
        btnContinue.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_continue -> {
                val intent = Intent(this@ResetPassActivity,LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}