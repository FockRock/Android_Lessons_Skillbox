package com.nick.counter

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
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

        binding.bReset.setOnClickListener {
            count = 0
            check(count)
        }
    }

    @SuppressLint("SetTextI18n", "ResourceAsColor")
    private fun check(number: Int) {
        if (number == 0) {
            binding.tvMainMessage.text = getString(R.string.green_alert)
            binding.bReset.isInvisible = true
            binding.tvNumber.text = count.toString()
        }
        if (number > 0) {
            binding.tvMainMessage.text = getString(R.string.seats_number) + " ${50 - number}"
            binding.tvMainMessage.setTextColor(Color.parseColor("#352DA9"))
        }
        if (number == 50) {
            binding.tvMainMessage.text = getString(R.string.no_seats)
            binding.bReset.isVisible = true
            binding.tvMainMessage.setTextColor(Color.parseColor("#D63030"))
        } else binding.bReset.isVisible = false
    }
}