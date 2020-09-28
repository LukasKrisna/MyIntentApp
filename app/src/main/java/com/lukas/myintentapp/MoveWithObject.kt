package com.lukas.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObject : AppCompatActivity() {
    companion object {
        const val EXTRA_PERSON = "extra_person"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_object)

        val tvObject: TextView = findViewById(R.id.tv_data_received)

        val person = intent.getParcelableExtra(EXTRA_PERSON) as Person
        val text = "Nama : ${person.name.toString()},\nEmail : ${person.email},\nUmur : ${person.age},\nLokasi : ${person.city}"
        tvObject.text = text
    }
}