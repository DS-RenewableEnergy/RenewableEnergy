package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySub3Binding

class SubActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sub3)
        val binding = ActivitySub3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener{
            val intent = Intent(this, SubActivity1For3::class.java)
            startActivity(intent)
        }
        binding.btn2.setOnClickListener{
            val intent = Intent(this, SubActivity2For3::class.java)
            startActivity(intent)
        }
        binding.btn3.setOnClickListener{
            val intent = Intent(this, SubActivity3For3::class.java)
            startActivity(intent)

        }
        binding.btn4.setOnClickListener{
            val intent = Intent(this, SubActivity4For3::class.java)
            startActivity(intent)

        }
    }
}