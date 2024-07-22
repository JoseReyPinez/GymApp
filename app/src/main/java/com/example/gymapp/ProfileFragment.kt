package com.example.gymapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        val sharedPreferences = requireContext().getSharedPreferences("user_prefs", Context.MODE_PRIVATE)
        val username = sharedPreferences.getString("username", "Unknown")
        val password = sharedPreferences.getString("password", "Unknown")

        val textUsername = view.findViewById<TextView>(R.id.text_username)
        textUsername.text = "Username: $username"

        val textPassword = view.findViewById<TextView>(R.id.text_password)
        textPassword.text = "Password: $password"

        return view
    }
}
