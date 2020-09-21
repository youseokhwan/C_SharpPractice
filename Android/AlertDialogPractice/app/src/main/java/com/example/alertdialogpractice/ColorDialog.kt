package com.example.alertdialogpractice

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class ColorDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)

            builder.setTitle("색상을 선택하세요")
                .setItems(R.array.colors,
                    DialogInterface.OnClickListener { _, which ->
                        Toast.makeText(
                            context,
                            resources.getStringArray(R.array.colors)[which] + "을(를) 선택하였습니다",
                            Toast.LENGTH_SHORT
                        ).show()
                    })

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}