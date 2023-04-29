package com.example.memes_assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class memos_activity : AppCompatActivity() {
    lateinit var tvnexttt:TextView
    lateinit var tvpreviousss:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memos)
        tvnexttt=findViewById(R.id.tvnexttt)
        tvpreviousss=findViewById(R.id.tvpreviousss)
        tvnexttt.setOnClickListener {
            var intent=Intent(this,last_activity::class.java)
            startActivity(intent)
        }
        tvpreviousss.setOnClickListener {
            var intent = Intent(this, memees_activity::class.java)
            startActivity(intent)
        }
    }
}