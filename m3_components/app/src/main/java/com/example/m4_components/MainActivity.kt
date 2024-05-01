package com.example.m4_components

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.m4_components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView (binding.root)

    }
}