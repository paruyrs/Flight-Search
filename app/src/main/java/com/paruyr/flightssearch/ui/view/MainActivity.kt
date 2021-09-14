package com.paruyr.flightssearch.ui.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.paruyr.flightssearch.R
import com.paruyr.flightssearch.databinding.ActivityMainBinding
import com.paruyr.flightssearch.ui.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    lateinit var context: Context

    lateinit var mainActivityViewModel: MainActivityViewModel

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        context = this@MainActivity
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        mainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)



        binding.departureView.setOnClickListener {

        }

    }

    private fun onDepartureViewClicked() {
    }
}