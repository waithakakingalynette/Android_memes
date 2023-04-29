package com.example.memes_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvmemes:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvmemes=findViewById(R.id.tvmemes)
        tvmemes.setOnClickListener {
            var intent=Intent(this,memo_activity::class.java)
            startActivity(intent)
        }
    }
}