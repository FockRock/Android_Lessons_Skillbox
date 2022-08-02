package com.nick.counter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.nick.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var count = 0
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPlus.setOnClickListener {
            if (count < 50){
                count++
                binding.count.text = count.toString()
                checking()
            }
        }

        binding.buttonMinus.setOnClickListener {
            if (count > 0){
                count--
                binding.count.text = count.toString()
                checking()
            }
        }

        binding.resetButton.setOnClickListener {
            count = 0
            checking()
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun checking() {
        when (count) {
            0 -> {
                binding.text.setTextColor(R.color.green)
                binding.count.text = count.toString()
                binding.buttonMinus.isEnabled = false
                binding.buttonPlus.isEnabled = true
                binding.resetButton.isVisible = false
                binding.text.text = getString(R.string.green_alert)
            }
            50 -> {
                binding.buttonPlus.isEnabled = false
                binding.resetButton.isVisible = true
                binding.text.text = getString(R.string.red_alert)
                binding.text.setTextColor(R.color.red)
            }
            else -> {
                binding.buttonMinus.isEnabled = true
                binding.buttonPlus.isEnabled = true
                binding.resetButton.isVisible = false
                val chairsLeft = (50 - count).toString()
                binding.text.text = getString(R.string.blue_alert) + " " + chairsLeft
                binding.text.setTextColor(R.color.blue)
            }
        }
    }
}