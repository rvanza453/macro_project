package com.example.simpelin_macro

import FragmentGoals
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNav.setOnNavigationItemSelectedListener(navListener)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, FragmentHome()).commit()
    }

    private val navListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            var selectedFragment: Fragment? = null
            when (item.itemId) {
                R.id.home -> selectedFragment = FragmentHome()
                R.id.goals -> selectedFragment = FragmentGoals()
                R.id.input -> selectedFragment = FragmentInput()
                R.id.transaction -> selectedFragment = FragmentTransaction()
//                R.id.profile -> selectedFragment = ProfileFragment()
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, selectedFragment!!).commit()
            true
        }
}
