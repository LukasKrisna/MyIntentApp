package com.lukas.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithData : AppCompatActivity() {
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val nama = intent.getStringExtra(EXTRA_NAME)
        val umur = intent.getIntExtra(EXTRA_AGE, 0)
        val a = "Namaku : $nama, Umurku : $umur"
        tvDataReceived.text = a
    }

}