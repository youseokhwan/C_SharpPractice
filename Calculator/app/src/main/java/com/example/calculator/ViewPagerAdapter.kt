
package com.example.calculator

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager?, lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager!!, lifecycle) {

    // Fragment를 담는 list 생성
    private val list = ArrayList<Fragment>()

    // Fragment의 위치를 반환하는 함수
    override fun createFragment(position: Int): Fragment {
        return list[position]
    }

    // list에 Fragment를 담는 함수
    fun addFragment(fragment: Fragment) {
        list.add(fragment)
    }

    // list의 크기를 반환하는 함수
    override fun getItemCount(): Int {
        return list.size
    }
}