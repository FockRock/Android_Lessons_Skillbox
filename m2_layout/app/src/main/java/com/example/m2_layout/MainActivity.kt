package com.example.m2_layout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.m2_layout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate (savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView (bindingClass.root)

        bindingClass.s.text = "Lesson 2 started!"
    }

}