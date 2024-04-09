package com.nick.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nick.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bMinus.setOnClickListener {
            if (count != 0) {
                count--
                binding.tvNumber.text = count.toString()
            }
        }

        binding.bPlus.setOnClickListener {
            if (count < 50) {
                count++
                binding.tvNumber.text = count.toString()
            }
        }
    }
}