package com.example.gymapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class DietFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_diet, container, false)

        val btnShowInfo = view.findViewById<Button>(R.id.btn_show_info)
        btnShowInfo.setOnClickListener {
            InfoDialogFragment().show(parentFragmentManager, "infoDialog")
        }

        val btnDietDetail1 = view.findViewById<Button>(R.id.btn_diet_detail_1)
        btnDietDetail1.setOnClickListener {
            val intent = Intent(activity, DietDetail1Activity::class.java)
            startActivity(intent)
        }

        val btnDietDetail2 = view.findViewById<Button>(R.id.btn_diet_detail_2)
        btnDietDetail2.setOnClickListener {
            val intent = Intent(activity, DietDetail2Activity::class.java)
            startActivity(intent)
        }

        val btnDietDetail3 = view.findViewById<Button>(R.id.btn_diet_detail_3)
        btnDietDetail3.setOnClickListener {
            val intent = Intent(activity, DietDetail3Activity::class.java)
            startActivity(intent)
        }

        return view
    }
}
