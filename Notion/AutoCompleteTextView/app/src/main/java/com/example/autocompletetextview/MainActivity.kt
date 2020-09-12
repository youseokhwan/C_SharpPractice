package com.example.autocompletetextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = resources.getStringArray(R.array.champion_list)
        ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list).also { adapter ->
            search.setAdapter(adapter)
        }
    }
}