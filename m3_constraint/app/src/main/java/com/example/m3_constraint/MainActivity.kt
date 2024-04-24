package com.example.m3_constraint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.m3_constraint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    var index = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.bPlay.setOnClickListener {
            index = 1
            bindingClass.tArtist.text = getText(R.string.qotsa)
            bindingClass.tSong.text = getText(R.string.one)
        }

        bindingClass.bForward.setOnClickListener {
            index ++
            when (index) {
                1 -> bindingClass.tSong.text = getText(R.string.one)
                2 -> bindingClass.tSong.text = getText(R.string.two)
                3 -> bindingClass.tSong.text = getText(R.string.three)
                4 -> bindingClass.tSong.text = getText(R.string.four)
                5 -> bindingClass.tSong.text = getText(R.string.five)
                6 -> bindingClass.tSong.text = getText(R.string.six)
                7 -> bindingClass.tSong.text = getText(R.string.seven)
                8 -> bindingClass.tSong.text = getText(R.string.eight)
                9 -> bindingClass.tSong.text = getText(R.string.nine)
                10 -> bindingClass.tSong.text = getText(R.string.ten)
                11 -> bindingClass.tSong.text = getText(R.string.eleven)
                12 -> bindingClass.tSong.text = getText(R.string.twelve)
                13 -> bindingClass.tSong.text = getText(R.string.thirteen)
                14 -> bindingClass.tSong.text = getText(R.string.fourteen)
                15 -> bindingClass.tSong.text = getText(R.string.fifteen)
                else -> {
                    bindingClass.tSong.text = getText(R.string.fifteen)
                    index--
                }
            }
        }
        bindingClass.bForward.setOnClickListener {
            index-=1
            when (index) {
                1 -> bindingClass.tSong.text = getText(R.string.one)
                2 -> bindingClass.tSong.text = getText(R.string.two)
                3 -> bindingClass.tSong.text = getText(R.string.three)
                4 -> bindingClass.tSong.text = getText(R.string.four)
                5 -> bindingClass.tSong.text = getText(R.string.five)
                6 -> bindingClass.tSong.text = getText(R.string.six)
                7 -> bindingClass.tSong.text = getText(R.string.seven)
                8 -> bindingClass.tSong.text = getText(R.string.eight)
                9 -> bindingClass.tSong.text = getText(R.string.nine)
                10 -> bindingClass.tSong.text = getText(R.string.ten)
                11 -> bindingClass.tSong.text = getText(R.string.eleven)
                12 -> bindingClass.tSong.text = getText(R.string.twelve)
                13 -> bindingClass.tSong.text = getText(R.string.thirteen)
                14 -> bindingClass.tSong.text = getText(R.string.fourteen)
                15 -> bindingClass.tSong.text = getText(R.string.fifteen)
                else -> {
                    bindingClass.tSong.text = getText(R.string.one)
                    index++
                }
            }
        }
    }
}
