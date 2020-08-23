package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.fragment_unit.view.*

class UnitFragment : Fragment() {

    private var spinnerList: String? = null

    // Fragment 객체 생성 후 Bundle을 사용해 값을 넣기
    companion object {
        fun newInstance(array: String): UnitFragment {
            val unitFragment = UnitFragment()
            val args         = Bundle()

            args.putString("getArray", array)
            unitFragment.arguments = args

            return unitFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // UnitConverterActivity에서 받은 값을 spinnerList에 대입하기
        this.spinnerList = arguments?.getString("getArray")!!
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view            = inflater.inflate(R.layout.fragment_unit, container, false)
        val spinnerBefore = view.spinnerAreaBefore
        val spinnerAfter  = view.spinnerAreaAfter

        // Adapter를 사용해 전달받은 값 spinnerAdapter를 스피너에 적용 하기
        val spinnerAdapter = ArrayAdapter.createFromResource(
            context!!, this.spinnerList!!.toInt(), R.layout.support_simple_spinner_dropdown_item
        )

        spinnerBefore.adapter = spinnerAdapter
        spinnerAfter .adapter = spinnerAdapter

        return view
    }
}