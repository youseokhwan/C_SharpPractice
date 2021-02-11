package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_unit_converter.*
import java.util.*
import kotlin.collections.ArrayList

class UnitConverterActivity : AppCompatActivity() {

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
        // 단위를 위한 리스트 초기화
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_converter)

        // ActionBar Title 변경
        supportActionBar?.setTitle(R.string.unit_converter_title)
        // ActionBar 그림자 없애기
        supportActionBar?.elevation = 0.0f
        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // 초기화 메소드 호출
        initName()
        initUnit()
        initAll()

        // spinnerList 정의
        val spinnerList = ArrayList<MutableList<String>>()

        // 고유 단위 현지화
        when (Locale.getDefault().language) {
            "ko" -> { // 한국어
                areaSpinnerList!!  .add("평"+" (평)")
                lengthSpinnerList!!.addAll(listOf("자"+" (자)", "리"+" (리)"))
                volumeSpinnerList!!.addAll(listOf("말"+" (말)", "되"+" (되)"))
                massSpinnerList!!  .addAll(listOf("근"+" (근)", "돈"+" (돈)"))
            }
            else -> {
                // pass
            }
        }

        // 각 단위 리스트를 spinnerList에 추가
        spinnerList.addAll(mutableListOf(areaSpinnerList, lengthSpinnerList, temperatureSpinnerList, volumeSpinnerList, massSpinnerList, dataSpinnerList, speedSpinnerList, timeSpinnerList))

        // 변수 Adapter에 ViewPagerAdapter를 객체화
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        // 각 단위 list를 adapter에 추가
        for (unitList in spinnerList) {
            adapter.addFragment(UnitFragment(unitList))
        }

        viewPager.adapter = adapter

        // TabLayout에 ViewPager를 연동
        TabLayoutMediator(tabLyUnit, viewPager, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when (position) {
                    0 -> tab.text = resources.getString(R.string.unit_area       ) // 면적
                    1 -> tab.text = resources.getString(R.string.unit_length     ) // 길이
                    2 -> tab.text = resources.getString(R.string.unit_temperature) // 온도
                    3 -> tab.text = resources.getString(R.string.unit_volume     ) // 부피
                    4 -> tab.text = resources.getString(R.string.unit_mass       ) // 무게
                    5 -> tab.text = resources.getString(R.string.unit_data       ) // 데이터
                    6 -> tab.text = resources.getString(R.string.unit_speed      ) // 속도
                    7 -> tab.text = resources.getString(R.string.unit_time       ) // 시간
                    else -> {
                        Log.d("Test", "Error!!")
                    }
                }
            }).attach()
    }

    // ActionBar ItemSelected 이벤트
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> { // 뒤로가기 버튼
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}