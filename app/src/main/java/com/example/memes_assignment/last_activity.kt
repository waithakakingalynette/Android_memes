package com.example.memes_assignment

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class last_activity : AppCompatActivity() {
    lateinit var tvprevioussss:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        tvprevioussss=findViewById(R.id.tvprevioussss)
        tvprevioussss.setOnClickListener {
            val intent=Intent(this,memos_activity::class.java)
            startActivity(intent)
        }
    }
}