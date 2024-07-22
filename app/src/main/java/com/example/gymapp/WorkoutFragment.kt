package com.example.gymapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class WorkoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_workout, container, false)

        val btnShowInfo = view.findViewById<Button>(R.id.btn_show_info)
        btnShowInfo.setOnClickListener {
            InfoDialogFragment().show(parentFragmentManager, "infoDialog")
        }

        val btnWorkoutDetail1 = view.findViewById<Button>(R.id.btn_workout_detail_1)
        btnWorkoutDetail1.setOnClickListener {
            val intent = Intent(activity, WorkoutDetail1Activity::class.java)
            startActivity(intent)
        }

        val btnWorkoutDetail2 = view.findViewById<Button>(R.id.btn_workout_detail_2)
        btnWorkoutDetail2.setOnClickListener {
            val intent = Intent(activity, WorkoutDetail2Activity::class.java)
            startActivity(intent)
        }

        val btnWorkoutDetail3 = view.findViewById<Button>(R.id.btn_workout_detail_3)
        btnWorkoutDetail3.setOnClickListener {
            val intent = Intent(activity, WorkoutDetail3Activity::class.java)
            startActivity(intent)
        }

        return view
    }
}
