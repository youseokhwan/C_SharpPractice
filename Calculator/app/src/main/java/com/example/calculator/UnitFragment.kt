package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_unit.view.*

class UnitFragment(private var spinnerList: MutableList<String>) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view            = inflater.inflate(R.layout.fragment_unit, container, false)
        val spinnerBefore = view.spinnerUnitBefore
        val spinnerAfter  = view.spinnerUnitAfter

        // 파라미터로 받은 spinnerList 적용
        val adapter = ArrayAdapter<String>(context!!, R.layout.support_simple_spinner_dropdown_item, spinnerList)

        spinnerBefore.adapter = adapter
        spinnerAfter .adapter = adapter

        // edtAreaBefore, edtAreaAfter 클릭 시 키보드 올라오지 않도록 설정
        view.edtUnitBefore.setTextIsSelectable(true)
        view.edtUnitBefore.showSoftInputOnFocus = false
        view.edtUnitAfter .setTextIsSelectable(true)
        view.edtUnitAfter .showSoftInputOnFocus = false

        return view
    }
}