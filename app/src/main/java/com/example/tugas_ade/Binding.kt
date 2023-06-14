package com.example.tugas_ade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tugas_ade.databinding.ActivityBindingBinding

class Binding : AppCompatActivity() {
    lateinit var binding: ActivityBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnbinding.setOnClickListener {
            Toast.makeText(this, "sudah pakai binding ya pak", Toast.LENGTH_LONG).show()
        }
    }
}
