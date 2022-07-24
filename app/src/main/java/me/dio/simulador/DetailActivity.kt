package me.dio.simulador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulador.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        setSupportActionBar(binding.toolbar)
        supportActionBar.setDefaultDisplayHomeAsUpEnabled(true)
    }
}