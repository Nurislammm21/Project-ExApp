package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            var num1 = 0
            var num2 = 0

            btnPlus.setOnClickListener {
                num1 = editNum1.text.toString().toInt()
                num2 = editNum2.text.toString().toInt()
                val resultNumber = num1 + num2
                Result.text = resultNumber.toString()
            }

            btnMulty.setOnClickListener {
                num1 = editNum1.text.toString().toInt()
                num2 = editNum2.text.toString().toInt()
                val resultNumber = num1 * num2
                Result.text = resultNumber.toString()
            }

            btnDivide.setOnClickListener {
                num1 = editNum1.text.toString().toInt()
                num2 = editNum2.text.toString().toInt()
                val resultNumber = num1 / num2
                Result.text = resultNumber.toString()
            }

            btnMinus.setOnClickListener {
                num1 = editNum1.text.toString().toInt()
                num2 = editNum2.text.toString().toInt()
                val resultNumber = num1 - num2
                Result.text = resultNumber.toString()
            }
        }
    }

}