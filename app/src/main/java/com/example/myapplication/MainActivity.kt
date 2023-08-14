package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doOnTextChanged
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.botaoUm.setOnClickListener {
            binding.textoUm.text = binding.editText.text
        }
        binding.textoUm.text = "Qualquer texto que eu queira."

        binding.editText.doOnTextChanged { text, start, before, count ->
            binding.textoUm.text = text
        }
    }
}