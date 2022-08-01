package com.nick.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nick.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlus.setOnClickListener {
            if (count < 50){
                count++
                binding.count.text = count.toString()
            } else {
                binding.buttonPlus.isEnabled = false
            }
        }

        binding.buttonMinus.setOnClickListener {
            if (count > 1){
                count--
                binding.count.text = count.toString()
            } else {
                binding.buttonMinus.isEnabled = false
            }
        }
    }
}