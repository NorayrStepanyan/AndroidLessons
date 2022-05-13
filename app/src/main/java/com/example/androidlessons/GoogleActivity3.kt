package com.example.androidlessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class GoogleActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google3)

        val bottomBack = findViewById<ImageView>(R.id.bottomBack3)
        val bottomNext = findViewById<ImageView>(R.id.bottomNext3)
        val googleEmail = findViewById<TextView>(R.id.googleEmail)
        val googleName = findViewById<TextView>(R.id.googleEditName)
        val googleSurName = findViewById<TextView>(R.id.googleEditSurName)
        val email = googleEmail.text
        val bundle: Bundle? = intent.extras
        val googleEditSurName = bundle?.get("googleEditSurName")
        val googleEditName = bundle?.get("googleEditName")


        bottomNext.setOnClickListener {
            val intent = Intent(this, GoogleActivity4::class.java)
            intent.putExtra("googleEmail", email)
            intent.putExtra("googleEditName2", googleEditName.toString())
            intent.putExtra("googleEditSurName2", googleEditSurName.toString())
            startActivity(intent)
        }


        bottomBack.setOnClickListener {
            val intent3 = Intent(this, GoogleActivity2::class.java)
            startActivity(intent3)
        }
    }
}