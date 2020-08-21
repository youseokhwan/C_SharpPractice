package com.example.calculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner

class UnitFragment : Fragment() {

    private var str: String? = null

    // Fragment 객체 생성 후 Bundle을 사용해 값을 넣기
    companion object {
        fun newInstance(str: String): UnitFragment {
            val unitFragment = UnitFragment()
            val args         = Bundle()

            args.putString("str", str)
            unitFragment.arguments = args

            return unitFragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // UnitConverterActivity에서 받은 값을 str에 대입하기
        if (arguments != null) {
            this.str = arguments!!.getString("str")!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_unit, container, false)
        val spinnerBefore = view.findViewById<View>(R.id.spinnerAreaBefore) as Spinner
        val spinnerAfter  = view.findViewById<View>(R.id.spinnerAreaAfter ) as Spinner

        // Adapter를 사용해 전달받은 값 str을 스피너에 적용 하기
        val myAdapter = ArrayAdapter.createFromResource(
            context!!, str!!.toInt(), R.layout.support_simple_spinner_dropdown_item
        )

        spinnerBefore.adapter = myAdapter
        spinnerAfter.adapter  = myAdapter

        return view
    }
}