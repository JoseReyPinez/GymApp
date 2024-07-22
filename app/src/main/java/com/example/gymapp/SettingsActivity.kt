package com.example.gymapp

import android.content.Context
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val sharedPreferences = getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val switchNotifications = findViewById<Switch>(R.id.switch_notifications)
        switchNotifications.isChecked = sharedPreferences.getBoolean("notifications", false)

        switchNotifications.setOnCheckedChangeListener { _, isChecked ->
            editor.putBoolean("notifications", isChecked)
            editor.apply()
        }
    }
}
