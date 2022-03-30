package org.d3if0018.kalkulatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if0018.kalkulatorapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}