package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //부기능 2로 이동(계산)
        binding.btn3.setOnClickListener {
            val intent = Intent(this, SubActivity3::class.java)
            startActivity(intent)
        }
        //부기능 4로 이동(설비)
        binding.btn4.setOnClickListener {
            val intent = Intent(this, SubActivity4::class.java)
            startActivity(intent)
        }
    }
}