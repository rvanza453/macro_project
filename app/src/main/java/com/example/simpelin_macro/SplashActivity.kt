package com.example.simpelin_macro

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.simpelin_macro.LoginActivity
import com.example.simpelin_macro.MainActivity
import com.example.simpelin_macro.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // Arahkan ke activity utama setelah delay selesai
            val intent = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000) // Delay dalam milidetik (misalnya, 3000ms atau 3 detik)
    }
}
