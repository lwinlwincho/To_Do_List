package com.llc.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import com.llc.todolist.databinding.ActivityLifeCycleBinding
import com.llc.todolist.viewModels.FirstViewModel

class ActivityLifeCycle : AppCompatActivity(), Delegate {

    private lateinit var binding: ActivityLifeCycleBinding
    private var name: String? = null


    private val viewModel: FirstViewModel by viewModels()


    private val itemAdapter by lazy {
        ItemAdapter(
            listener = {},
            delegate = this
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLifeCycleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        name = "Hello"
        Log.d(TAG, "onCreate Called")

        //binding.textView.text = TAG
        binding.btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val firstName = viewModel.firstName
        binding.textView.text = firstName
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        name = null
        Log.d(TAG, "onDestroy Called")
    }

    companion object {
        const val TAG = "MainActivity"
    }

    override fun onClickListener(model: MovieModel) {
        Toast.makeText(this, model.toString(), Toast.LENGTH_LONG).show()
    }
}