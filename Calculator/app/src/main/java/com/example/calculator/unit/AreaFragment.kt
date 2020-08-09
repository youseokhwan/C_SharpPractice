package com.example.calculator.unit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.calculator.R

class AreaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_area, container, false)

        // Before Spinner
        val spinnerBefore: Spinner = root.findViewById(R.id.spinnerAreaBefore)
        ArrayAdapter.createFromResource(
            context!!,
            R.array.spinnerArrayArea,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerBefore.adapter = adapter
        }

        // After Spinner
        val spinnerAfter: Spinner = root.findViewById(R.id.spinnerAreaAfter)
        ArrayAdapter.createFromResource(
            context!!,
            R.array.spinnerArrayArea,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerAfter.adapter = adapter
        }

        return root
    }
}