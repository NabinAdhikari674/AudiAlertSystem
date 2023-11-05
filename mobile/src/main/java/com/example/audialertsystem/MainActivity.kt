package com.example.audialertsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.widget.Button

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.settingsButton)
        // Set a click listener for the button
        button.setOnClickListener {
            // Create an Intent to open the target activity
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
    }
}

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_page)

        val button = findViewById<Button>(R.id.backToHomeButton)
        // Set a click listener for the button
        button.setOnClickListener {
            // Create an Intent to open the target activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}