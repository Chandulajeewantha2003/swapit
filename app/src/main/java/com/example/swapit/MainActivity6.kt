package com.example.swapit

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main6)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize bottom navigation
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Set Categories selected by default
        bottomNav.selectedItemId = R.id.nav_categories

        // Handle item clicks
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, MainActivity5::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                R.id.nav_categories -> {
                    // Already in MainActivity6
                    true
                }
                R.id.nav_myitems -> {
                    startActivity(Intent(this, MainActivity7::class.java))
                    overridePendingTransition(0,0)
                    true
                }
                R.id.nav_profile -> {
                    startActivity(Intent(this, MainActivity8::class.java))
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
