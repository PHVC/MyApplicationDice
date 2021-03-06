package com.example.myapplicationdice.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplicationdice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding

    }

    private fun choiceDice() {
        val stringInTextField = binding.textEditSideDice.text.toString()
        val sides = stringInTextField.toBigDecimalOrNull()
        if (sides == null) {
            binding.viewDiceResult.text = "?"
            return
        }
    }
}