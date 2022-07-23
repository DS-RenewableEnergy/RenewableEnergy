package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySubActivity1For3Binding

class SubActivity1For3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sub_activity1_for3)
        val binding = ActivitySubActivity1For3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calulate.setOnClickListener{
            val intent = Intent(this, SubActivity5For3::class.java)
            startActivity(intent)
        }

    }
}