package com.example.androidlessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val back = findViewById<TextView>(R.id.back)
        val bundle: Bundle? = intent.extras
        val userName = bundle?.get("name")
        val userSurName = bundle?.get("surName")
        val getName = findViewById<TextView>(R.id.getName)


        getName.text = "$userName $userSurName"

        back.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}