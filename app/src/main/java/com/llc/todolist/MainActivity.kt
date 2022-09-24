package com.llc.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.llc.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.textView.text = "Hello World"
        val tx = binding.textView.text.toString()

        binding.edt.setText("Happy Birthday")

        binding.button.setOnClickListener {
            Toast.makeText(this, tx, Toast.LENGTH_LONG).show()
        }

        binding.floatingActionButton.setOnClickListener {
            val editText = binding.edt.text.toString()
            Toast.makeText(this, editText, Toast.LENGTH_LONG).show()
        }
    }
}

// https://developer.android.com/topic/libraries/view-binding#kotlin