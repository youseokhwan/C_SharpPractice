package com.example.alertdialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class DeleteDialog : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)

            builder.setMessage("정말 삭제하시겠습니까?")
                .setPositiveButton("삭제",
                    DialogInterface.OnClickListener { _, _ ->
                        Toast.makeText(context, "삭제되었습니다", Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("취소", null)

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}