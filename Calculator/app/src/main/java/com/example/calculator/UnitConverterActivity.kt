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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unit_converter)

        // ActionBar Title 변경
        supportActionBar?.setTitle(R.string.unit_converter_title)
        // ActionBar 그림자 없애기
        supportActionBar?.elevation = 0.0f
        // ActionBar Home 버튼 Enable
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // spinnerList 정의
        val spinnerList = ArrayList<MutableList<String>>()

        // string-array 리소스 참조
        val areaList        = resources.getStringArray(R.array.spinnerArrayArea       ).toMutableList() // 면적
        val lengthList      = resources.getStringArray(R.array.spinnerArrayLength     ).toMutableList() // 길이
        val temperatureList = resources.getStringArray(R.array.spinnerArrayTemperature).toMutableList() // 온도
        val volumeList      = resources.getStringArray(R.array.spinnerArrayVolume     ).toMutableList() // 부피
        val massList        = resources.getStringArray(R.array.spinnerArrayMass       ).toMutableList() // 무게
        val dataList        = resources.getStringArray(R.array.spinnerArrayData       ).toMutableList() // 데이터
        val speedList       = resources.getStringArray(R.array.spinnerArraySpeed      ).toMutableList() // 속도
        val timeList        = resources.getStringArray(R.array.spinnerArrayTime       ).toMutableList() // 시간

        // 고유 단위 현지화
        when (Locale.getDefault().language) {
            "ko" -> { // 한국어
                areaList  .add("평")
                lengthList.addAll(listOf("자", "리"))
                volumeList.addAll(listOf("말", "되"))
                massList  .addAll(listOf("근", "돈"))
            }
            else -> {
                // pass
            }
        }

        // 각 단위 리스트를 spinnerList에 추가
        spinnerList.addAll(mutableListOf(areaList, lengthList, temperatureList, volumeList, massList, dataList, speedList, timeList))

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