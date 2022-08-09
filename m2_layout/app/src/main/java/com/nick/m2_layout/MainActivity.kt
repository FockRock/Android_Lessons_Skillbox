package com.nick.m2_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nick.m2_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = "Верхняя строчка, настроенная из кода"
        binding.text2.text = "Нижняя строчка, настроенная из кода"
    }
}