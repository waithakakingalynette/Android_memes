package com.example.memes_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memees_activity : AppCompatActivity() {
    lateinit var tvmemees:TextView
    lateinit var tvpreviouss:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memees)
        tvmemees=findViewById(R.id.tvmemees)
        tvpreviouss=findViewById(R.id.tvpreviouss)
        tvmemees.setOnClickListener {
            var intent=Intent(this,memos_activity::class.java)
            startActivity(intent)
        }
        tvpreviouss.setOnClickListener {
            var intent=Intent(this,memo_activity::class.java)
            startActivity(intent)
        }

    }
}