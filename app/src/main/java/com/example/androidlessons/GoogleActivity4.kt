package com.example.androidlessons

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi

class GoogleActivity4 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google4)


        val bottomHome = findViewById<ImageView>(R.id.bottomHome)
        val finalText = findViewById<TextView>(R.id.finalText)
        val bundle: Bundle? = intent.extras
        val googleEmail = bundle?.get("googleEmail")
        val googleEditSurName = bundle?.get("googleEditSurName2")
        val googleEditName = bundle?.get("googleEditName2")
        finalText.setTextColor(getColor(R.color.black))



        finalText.text = "Congratulations $googleEditName $googleEditSurName You already have a new Email $googleEmail gmail.com (Click home to create a new one)"

        bottomHome.setOnClickListener {
            val intent = Intent(this, GoogleActivity::class.java)
            startActivity(intent)
        }
    }
}