package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.calculator.unit.*
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

        // ViewPager Adapter를 사용해 TabLayout과 연동
        val adapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(AreaFragment()       , resources.getText  (R.string.unit_area).toString().toLowerCase())
        adapter.addFragment(LengthFragment()     , resources.getString(R.string.unit_length)         .toLowerCase())
        adapter.addFragment(TemperatureFragment(), resources.getString(R.string.unit_temperature)    .toLowerCase())
        adapter.addFragment(VolumeFragment()     , resources.getString(R.string.unit_volume)         .toLowerCase())
        adapter.addFragment(WeightFragment()     , resources.getString(R.string.unit_mass)           .toLowerCase())
        adapter.addFragment(DataFragment()       , resources.getString(R.string.unit_data)           .toLowerCase())
        adapter.addFragment(SpeedFragment()      , resources.getString(R.string.unit_speed)          .toLowerCase())
        adapter.addFragment(TimeFragment()       , resources.getString(R.string.unit_time)           .toLowerCase())

        viewPager.adapter = adapter
        tabLyUnit.setupWithViewPager(viewPager)
    }

    // ActionBar ItemSelected 이벤트
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}