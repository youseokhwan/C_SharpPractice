package com.example.alertdialogpractice

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class LoginDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            val inflater = requireActivity().layoutInflater

            builder.setTitle("로그인")
                .setView(inflater.inflate(R.layout.dialog_login, null))
                .setPositiveButton("로그인", null)
                .setNegativeButton("취소", null)
                .setNeutralButton("회원가입", null)

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}