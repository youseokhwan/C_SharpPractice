package com.example.calculator.unit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.calculator.R

class LengthFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_length, container, false)

        // Before Spinner
        val spinner: Spinner = root.findViewById(R.id.spinnerLengthBefore)
        ArrayAdapter.createFromResource(
            context!!,
            R.array.spinnerArrayLength,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        // After Spinner
        val spinner2: Spinner = root.findViewById(R.id.spinnerLengthAfter)
        ArrayAdapter.createFromResource(
            context!!,
            R.array.spinnerArrayLength,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }

        return root
    }
}