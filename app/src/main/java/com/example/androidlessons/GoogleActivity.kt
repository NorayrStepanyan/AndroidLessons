package com.example.androidlessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class GoogleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google)

        val bottomStart = findViewById<TextView>(R.id.start)


        bottomStart.setOnClickListener {
            val intent1 = Intent(this, GoogleActivity2::class.java)
            startActivity(intent1)
        }
    }
}