package com.nick.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
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
                check(count)
            }
        }

        binding.bPlus.setOnClickListener {
            if (count < 50) {
                count++
                binding.tvNumber.text = count.toString()
                check(count)
            }
        }
    }

    private fun check (number: Int) {
        if (number > 0) {
            binding.tvMainMessage.text = "Свободных мест: ${50-number}"
        }
        if (number == 50) {
            binding.tvMainMessage.text = "Все места заняты!"
            binding.bReset.isVisible = true
        } else binding.bReset.isVisible = false
    }
}