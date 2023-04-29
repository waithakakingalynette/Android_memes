package com.example.memes_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memo_activity : AppCompatActivity() {
    lateinit var tvmemo:TextView
    lateinit var tvprevious:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memo)
        tvmemo=findViewById(R.id.tvmemo)
        tvprevious=findViewById(R.id.tvprevious)
        tvmemo.setOnClickListener {
            var intent=Intent(this,memees_activity::class.java)
            startActivity(intent)
        }
        tvprevious.setOnClickListener {
            var intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}