package com.example.gymapp

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class InfoDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater
            val view = inflater.inflate(R.layout.fragment_info_dialog, null)

            builder.setView(view)
                .setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}
