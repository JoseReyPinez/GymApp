package com.example.gymapp

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WorkoutDetail1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout1_detail)

        val btnBack = findViewById<Button>(R.id.btn_back)
        btnBack.setOnClickListener {
            finish()
        }
    }
}
