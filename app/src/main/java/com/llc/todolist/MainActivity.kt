package com.llc.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.layout_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_setting1 -> {
                Toast.makeText(this, "Setting One", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_setting2 -> {
                Toast.makeText(this, "Setting Two", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_setting3 -> {
                Toast.makeText(this, "Setting Three", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

// https://developer.android.com/topic/libraries/view-binding#kotlin