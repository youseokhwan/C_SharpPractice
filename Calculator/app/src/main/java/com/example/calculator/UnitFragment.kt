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
    private var areaList        = mutableListOf<String>()
    private var lengthList      = mutableListOf<String>()
    private var temperatureList = mutableListOf<String>()
    private var volumeList      = mutableListOf<String>()
    private var massList        = mutableListOf<String>()
    private var dataList        = mutableListOf<String>()
    private var speedList       = mutableListOf<String>()
    private var timeList        = mutableListOf<String>()

    // 단위를 위한 리스트 초기화
    private var areaSignList        = mutableListOf<String>()
    private var lengthSignList      = mutableListOf<String>()
    private var temperatureSignList = mutableListOf<String>()
    private var volumeSignList      = mutableListOf<String>()
    private var massSignList        = mutableListOf<String>()
    private var dataSignList        = mutableListOf<String>()
    private var speedSignList       = mutableListOf<String>()
    private var timeSignList        = mutableListOf<String>()

    // 이름 + 단위 리스트 초기화
    private val areaSpinnerList        = mutableListOf<String>()
    private val lengthSpinnerList      = mutableListOf<String>()
    private val temperatureSpinnerList = mutableListOf<String>()
    private val volumeSpinnerList      = mutableListOf<String>()
    private val massSpinnerList        = mutableListOf<String>()
    private val dataSpinnerList        = mutableListOf<String>()
    private val speedSpinnerList       = mutableListOf<String>()
    private val timeSpinnerList        = mutableListOf<String>()

    // 리스트 초기화 메소드
    private fun initName() {
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

    private fun initUnit() {
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

    private fun initAll() {
        // 이름 + 단위 리스트
        for (i in areaList.indices) {
            areaSpinnerList.add(areaList[i] + " (" + areaSignList[i]+")")
        }
        for (i in lengthList.indices) {
            lengthSpinnerList.add(lengthList[i] + " (" + lengthSignList[i]+")")
        }
        for (i in temperatureList.indices) {
            temperatureSpinnerList.add(temperatureList[i] + " (" + temperatureSignList[i]+")")
        }
        for (i in volumeList.indices) {
            volumeSpinnerList.add(volumeList[i] + " (" + volumeSignList[i]+")")
        }
        for (i in massList.indices) {
            massSpinnerList.add(massList[i] + " (" + massSignList[i]+")")
        }
        for (i in dataList.indices) {
            dataSpinnerList.add(dataList[i] + " (" + dataSignList[i]+")")
        }
        for (i in speedList.indices) {
            speedSpinnerList.add(speedList[i] + " (" + speedSignList[i]+")")
        }
        for (i in timeList.indices) {
            timeSpinnerList.add(timeList[i] + " (" + timeSignList[i]+")")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view          = inflater.inflate(R.layout.fragment_unit, container, false)
        val spinnerBefore = view.spinnerUnitBefore
        val spinnerAfter  = view.spinnerUnitAfter
        val txtUnitBefore = view.txtUnitBefore
        val txtUnitAfter  = view.txtUnitAfter

        // 파라미터로 받은 spinnerList 적용
        val adapter = ArrayAdapter<String>(context!!, R.layout.support_simple_spinner_dropdown_item, spinnerList)

        spinnerBefore.adapter = adapter
        spinnerAfter .adapter = adapter

        // 초기화 함수 호출
        initName()
        initUnit()
        initAll()

        // Before 스피너 선택 시 txt 변경
        spinnerBefore.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d("Test", "NothingSelected!!")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                for (i in areaSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        areaSpinnerList[i] -> {
                            txtUnitBefore.text = areaSignList[i]
                        }
                    }
                }
                for (i in lengthSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        lengthSpinnerList[i] -> {
                            txtUnitBefore.text = lengthSignList[i]
                        }
                    }
                }
                for (i in temperatureSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        temperatureSpinnerList[i] -> {
                            txtUnitBefore.text = temperatureSignList[i]
                        }
                    }
                }
                for (i in volumeSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        volumeSpinnerList[i] -> {
                            txtUnitBefore.text = volumeSignList[i]
                        }
                    }
                }
                for (i in massSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        massSpinnerList[i] -> {
                            txtUnitBefore.text = massSignList[i]
                        }
                    }
                }
                for (i in dataSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        dataSpinnerList[i] -> {
                            txtUnitBefore.text = dataSignList[i]
                        }
                    }
                }
                for (i in speedSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        speedSpinnerList[i] -> {
                            txtUnitBefore.text = speedSignList[i]
                        }
                    }
                }
                for (i in timeSpinnerList.indices) {
                    when (spinnerBefore.getItemAtPosition(position)) {
                        timeSpinnerList[i] -> {
                            txtUnitBefore.text = timeSignList[i]
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

        // After 스피너 선택 시 txt 변경
        spinnerAfter.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                Log.d("Test", "NothingSelected!!")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                for (i in areaSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        areaSpinnerList[i] -> {
                            txtUnitAfter.text = areaSignList[i]
                        }
                    }
                }
                for (i in lengthSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        lengthSpinnerList[i] -> {
                            txtUnitAfter.text = lengthSignList[i]
                        }
                    }
                }
                for (i in temperatureSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        temperatureSpinnerList[i] -> {
                            txtUnitAfter.text = temperatureSignList[i]
                        }
                    }
                }
                for (i in volumeSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        volumeSpinnerList[i] -> {
                            txtUnitAfter.text = volumeSignList[i]
                        }
                    }
                }
                for (i in massSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        massSpinnerList[i] -> {
                            txtUnitAfter.text = massSignList[i]
                        }
                    }
                }
                for (i in dataSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        dataSpinnerList[i] -> {
                            txtUnitAfter.text = dataSignList[i]
                        }
                    }
                }
                for (i in speedSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        speedSpinnerList[i] -> {
                            txtUnitAfter.text = speedSignList[i]
                        }
                    }
                }
                for (i in timeSpinnerList.indices) {
                    when (spinnerAfter.getItemAtPosition(position)) {
                        timeSpinnerList[i] -> {
                            txtUnitAfter.text = timeSignList[i]
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
