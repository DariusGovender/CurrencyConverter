package com.example.currencyconverter

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.clSplash)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        navigateMainMenu()
    }

    private fun navigateMainMenu() {
        Handler(Looper.getMainLooper()).postDelayed({
            // Start MainActivity after the delay
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Finish SplashScreenActivity so the user cannot return to it
        }, 3000) // 3000 milliseconds = 3 seconds
    }
}