package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_unit_converter.*

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

        // ArrayList에 Spinner 추가
        val spinnerList = ArrayList<String>()

        spinnerList.add(R.array.spinnerArrayArea       .toString()) // 면적
        spinnerList.add(R.array.spinnerArrayLength     .toString()) // 길이
        spinnerList.add(R.array.spinnerArrayTemperature.toString()) // 온도
        spinnerList.add(R.array.spinnerArrayVolume     .toString()) // 부피
        spinnerList.add(R.array.spinnerArrayMass       .toString()) // 무게
        spinnerList.add(R.array.spinnerArrayData       .toString()) // 데이터
        spinnerList.add(R.array.spinnerArraySpeed      .toString()) // 속도
        spinnerList.add(R.array.spinnerArrayTime       .toString()) // 시간

        // 변수 Adapter에 ViewPager Adapter를 객체화
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        // Spinner 리스트들을 각 Fragment에 대입
        for (i in 0..7) {
            adapter!!.addFragment(UnitFragment.newInstance(spinnerList[i]))
        }

        viewPager!!.adapter = adapter

        // TabLayout에 ViewPager를 연동
        TabLayoutMediator(tabLyUnit!!, viewPager!!, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
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
                        TODO()
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