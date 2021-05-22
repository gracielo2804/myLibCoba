package com.gracielo.ilt15_continousintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gracielo.ilt15_continousintegration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}