package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.myapplication.databinding.ActivitySub3Binding
import com.example.myapplication.databinding.ActivitySub4Binding
import org.jsoup.Jsoup

class SubActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySub4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var data1=listOf("시공분야 선택", "태양광", "태양열", "지열", "연료전지", "소형풍력")
        var adapter1=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data1)
        binding.spinner1.adapter=adapter1
        var data2=listOf("시공지역 선택", "서울", "세종", "부산","대구","인천","광주","대전","울산","경기","강원","충북","충남","전북","전남","경북","경남","제주")
        var adapter2=ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,data2)
        binding.spinner2.adapter=adapter2


        binding.btnSearch.setOnClickListener {
            val intent = Intent(this, SubActivity1For4::class.java)
            startActivity(intent)
        }


    }


}