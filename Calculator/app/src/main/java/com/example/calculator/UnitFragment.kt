package com.example.calculator

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_unit.view.*

class UnitFragment(private var spinnerList: MutableList<String>) : Fragment() {

    // string-array 리소스 참조
    var areaList        : MutableList<String>? = null
    var lengthList      : MutableList<String>? = null
    var temperatureList : MutableList<String>? = null
    var volumeList      : MutableList<String>? = null
    var massList        : MutableList<String>? = null
    var dataList        : MutableList<String>? = null
    var speedList       : MutableList<String>? = null
    var timeList        : MutableList<String>? = null

    // 단위를 위한 리스트 초기화
    var areaSignList        : MutableList<String>? = null
    var lengthSignList      : MutableList<String>? = null
    var temperatureSignList : MutableList<String>? = null
    var volumeSignList      : MutableList<String>? = null
    var massSignList        : MutableList<String>? = null
    var dataSignList        : MutableList<String>? = null
    var speedSignList       : MutableList<String>? = null
    var timeSignList        : MutableList<String>? = null

    // 이름 + 단위 리스트 초기화
    val areaListAll        = mutableListOf<String>()
    val lengthListAll      = mutableListOf<String>()
    val temperatureListAll = mutableListOf<String>()
    val volumeListAll      = mutableListOf<String>()
    val massListAll        = mutableListOf<String>()
    val dataListAll        = mutableListOf<String>()
    val speedListAll       = mutableListOf<String>()
    val timeListAll        = mutableListOf<String>()

    //리스트 초기화 메소드
    private fun initName(){
        // string-array 리소스 참조
        areaList        = resources.getStringArray(R.array.spinnerArrayArea       ).toMutableList() // 면적
        lengthList      = resources.getStringArray(R.array.spinnerArrayLength     ).toMutableList() // 길이
        temperatureList = resources.getStringArray(R.array.spinnerArrayTemperature).toMutableList() // 온도
        volumeList      = resources.getStringArray(R.array.spinnerArrayVolume     ).toMutableList() // 부피
        massList        = resources.getStringArray(R.array.spinnerArrayMass       ).toMutableList() // 무게
        dataList        = resources.getStringArray(R.array.spinnerArrayData       ).toMutableList() // 데이터
        speedList       = resources.getStringArray(R.array.spinnerArraySpeed      ).toMutableList() // 속도
        timeList        = resources.getStringArray(R.array.spinnerArrayTime       ).toMutableList() // 시간
    }
    private fun initUnit(){
        // 단위를 위한 리스트
        areaSignList        = resources.getStringArray(R.array.spinnerArrayAreaSign       ).toMutableList() // 면적단위
        lengthSignList      = resources.getStringArray(R.array.spinnerArrayLengthSign     ).toMutableList() // 길이단위
        temperatureSignList = resources.getStringArray(R.array.spinnerArrayTemperatureSign).toMutableList() // 온도단위
        volumeSignList      = resources.getStringArray(R.array.spinnerArrayVolumeSign     ).toMutableList() // 부피단위
        massSignList        = resources.getStringArray(R.array.spinnerArrayMassSign       ).toMutableList() // 무게단위
        dataSignList        = resources.getStringArray(R.array.spinnerArrayDataSign       ).toMutableList() // 데이터단위
        speedSignList       = resources.getStringArray(R.array.spinnerArraySpeedSign      ).toMutableList() // 속도단위
        timeSignList        = resources.getStringArray(R.array.spinnerArrayTimeSign       ).toMutableList() // 시간단위
    }
    private fun initAll(){
        // 이름 + 단위 리스트
        for(i in areaList!!.indices) {
            areaListAll!!.add(areaList!![i] + " (" + areaSignList!![i]+")")
        }
        for(i in lengthList!!.indices) {
            lengthListAll!!.add(lengthList!![i] + " (" + lengthSignList!![i]+")")
        }
        for(i in temperatureList!!.indices) {
            temperatureListAll!!.add(temperatureList!![i] + " (" + temperatureSignList!![i]+")")
        }
        for(i in volumeList!!.indices) {
            volumeListAll!!.add(volumeList!![i] + " (" + volumeSignList!![i]+")")
        }
        for(i in massList!!.indices) {
            massListAll!!.add(massList!![i] + " (" + massSignList!![i]+")")
        }
        for(i in dataList!!.indices) {
            dataListAll!!.add(dataList!![i] + " (" + dataSignList!![i]+")")
        }
        for(i in speedList!!.indices) {
            speedListAll!!.add(speedList!![i] + " (" + speedSignList!![i]+")")
        }
        for(i in timeList!!.indices) {
            timeListAll!!.add(timeList!![i] + " (" + timeSignList!![i]+")")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view            = inflater.inflate(R.layout.fragment_unit, container, false)
        val spinnerBefore = view.spinnerUnitBefore
        val spinnerAfter  = view.spinnerUnitAfter
        val txtUnitBefore = view.txtUnitBefore
        val txtUnitAfter = view.txtUnitAfter

        // 파라미터로 받은 spinnerList 적용
        val adapter = ArrayAdapter<String>(context!!, R.layout.support_simple_spinner_dropdown_item, spinnerList)

        spinnerBefore.adapter = adapter
        spinnerAfter .adapter = adapter

        //초기화 함수 호출
        initName()
        initUnit()
        initAll()

        //Before 스피너 선택 시 txt 변경
        spinnerBefore.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d("Test", "NothingSelected!!")
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                for (i in areaListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        areaListAll[i] -> {
                            txtUnitBefore.text = areaSignList!![i]
                        }
                    }
                }
                for (i in lengthListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        lengthListAll[i] -> {
                            txtUnitBefore.text = lengthSignList!![i]
                        }
                    }
                }
                for (i in temperatureListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        temperatureListAll[i] -> {
                            txtUnitBefore.text = temperatureSignList!![i]
                        }
                    }
                }
                for (i in volumeListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        volumeListAll[i] -> {
                            txtUnitBefore.text = volumeSignList!![i]
                        }
                    }
                }
                for (i in massListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        massListAll[i] -> {
                            txtUnitBefore.text = massSignList!![i]
                        }
                    }
                }
                for (i in dataListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        dataListAll[i] -> {
                            txtUnitBefore.text = dataSignList!![i]
                        }
                    }
                }
                for (i in speedListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        speedListAll[i] -> {
                            txtUnitBefore.text = speedSignList!![i]
                        }
                    }
                }
                for (i in timeListAll.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        timeListAll[i] -> {
                            txtUnitBefore.text = timeSignList!![i]
                        }
                    }
                }
                when (spinnerBefore.getItemAtPosition(position)) {
                    "평 (평)" -> {
                        txtUnitBefore.text = "평"
                    }
                }
                when (spinnerBefore.getItemAtPosition(position)) {
                    "자 (자)" -> {
                        txtUnitBefore.text = "자"
                    }
                }
                when (spinnerBefore.getItemAtPosition(position)) {
                    "리 (리)" -> {
                        txtUnitBefore.text = "리"
                    }
                }
                when (spinnerBefore.getItemAtPosition(position)) {
                    "말 (말)" -> {
                        txtUnitBefore.text = "말"
                    }
                }
                when (spinnerBefore.getItemAtPosition(position)) {
                    "되 (되)" -> {
                        txtUnitBefore.text = "되"
                    }
                }
                when (spinnerBefore.getItemAtPosition(position)) {
                    "근 (근)" -> {
                        txtUnitBefore.text = "근"
                    }
                }
                when (spinnerBefore.getItemAtPosition(position)) {
                    "돈 (돈)" -> {
                        txtUnitBefore.text = "돈"
                    }
                }
            }
        }

        //After 스피너 선택 시 txt 변경
        spinnerAfter.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d("Test", "NothingSelected!!")
            }
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                for (i in areaListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        areaListAll[i] -> {
                            txtUnitAfter.text = areaSignList!![i]
                        }
                    }
                }
                for (i in lengthListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        lengthListAll[i] -> {
                            txtUnitAfter.text = lengthSignList!![i]
                        }
                    }
                }
                for (i in temperatureListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        temperatureListAll[i] -> {
                            txtUnitAfter.text = temperatureSignList!![i]
                        }
                    }
                }
                for (i in volumeListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        volumeListAll[i] -> {
                            txtUnitAfter.text = volumeSignList!![i]
                        }
                    }
                }
                for (i in massListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        massListAll[i] -> {
                            txtUnitAfter.text = massSignList!![i]
                        }
                    }
                }
                for (i in dataListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        dataListAll[i] -> {
                            txtUnitAfter.text = dataSignList!![i]
                        }
                    }
                }
                for (i in speedListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        speedListAll[i] -> {
                            txtUnitAfter.text = speedSignList!![i]
                        }
                    }
                }
                for (i in timeListAll.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        timeListAll[i] -> {
                            txtUnitAfter.text = timeSignList!![i]
                        }
                    }
                }
                when (spinnerAfter.getItemAtPosition(position)) {
                    "평 (평)" -> {
                        txtUnitAfter.text = "평"
                    }
                }
                when (spinnerAfter.getItemAtPosition(position)) {
                    "자 (자)" -> {
                        txtUnitAfter.text = "자"
                    }
                }
                when (spinnerAfter.getItemAtPosition(position)) {
                    "리 (리)" -> {
                        txtUnitAfter.text = "리"
                    }
                }
                when (spinnerAfter.getItemAtPosition(position)) {
                    "말 (말)" -> {
                        txtUnitAfter.text = "말"
                    }
                }
                when (spinnerAfter.getItemAtPosition(position)) {
                    "되 (되)" -> {
                        txtUnitAfter.text = "되"
                    }
                }
                when (spinnerAfter.getItemAtPosition(position)) {
                    "근 (근)" -> {
                        txtUnitAfter.text = "근"
                    }
                }
                when (spinnerAfter.getItemAtPosition(position)) {
                    "돈 (돈)" -> {
                        txtUnitAfter.text = "돈"
                    }
                }
            }
        }

        // edtAreaBefore, edtAreaAfter 클릭 시 키보드 올라오지 않도록 설정
        view.edtUnitBefore.setTextIsSelectable(true)
        view.edtUnitBefore.showSoftInputOnFocus = false
        view.edtUnitAfter .setTextIsSelectable(true)
        view.edtUnitAfter .showSoftInputOnFocus = false

        return view
    }
}
