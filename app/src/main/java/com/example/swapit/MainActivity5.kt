package com.example.swapit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize bottom navigation
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Set Home selected by default
        bottomNav.selectedItemId = R.id.nav_home

        // Handle item clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    // Already in MainActivity5
                    true
                }
                R.id.nav_categories -> {
                    startActivity(Intent(this, MainActivity6::class.java))
                    overridePendingTransition(0,0) // No animation
                    true
                }
                R.id.nav_myitems -> {
                    //startActivity(Intent(this, MainActivity7::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                R.id.nav_profile -> {
                    //startActivity(Intent(this, MainActivity8::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                R.id.nav_additems -> {
                    startActivity(Intent(this, MainActivity9::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                else -> false
            }
        }
    }
}
