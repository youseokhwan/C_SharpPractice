package com.example.recyclerviewpet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val dataArray: ArrayList<String> = ArrayList() // 1. 빈 배열 목록 선언

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addDataArray() // 2. 배열 내용 로드

        rv_data_list.layoutManager = LinearLayoutManager(this) // 4. 레이아웃 매니저를 생성

        // 5. RecyclerView 어댑터에 접근해 데이터를 로드
        rv_data_list.adapter = DataAdapter(dataArray, this) // DataAdapter 작성 매칭
    }

    // 3. 배열 내용을 채우는 함수
    private fun addDataArray() {
        dataArray.add("오리")
        dataArray.add("호랑이")
        dataArray.add("여우")
        dataArray.add("늑대")
        dataArray.add("오소리")
        dataArray.add("원숭이")
        dataArray.add("물개")
        dataArray.add("펭귄")
        dataArray.add("하마")
        dataArray.add("미어캣")
        dataArray.add("타조")
    }
}
