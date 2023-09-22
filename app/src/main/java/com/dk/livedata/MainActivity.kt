package com.dk.livedata

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : ComponentActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var tvValue:TextView
    lateinit var btnChange:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvValue = findViewById(R.id.tv_value)
        btnChange = findViewById(R.id.btn_change)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.mutableLiveData.observe(this, Observer {
            tvValue.text = it
        })
    }

    fun updateTextValue(v:View){
         mainViewModel.updateLiveDate()
    }
}

