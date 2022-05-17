package com.example.androidlessons

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog

class GoogleActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google2)

        val googleName = findViewById<TextView>(R.id.googleEditName)
        val googleSurName = findViewById<TextView>(R.id.googleEditSurName)
        val bottomBack = findViewById<ImageView>(R.id.bottomBack2)
        val bottomNext1 = findViewById<ImageView>(R.id.bottomNext1)
        val name2 = googleName.text
        val surName2 = googleSurName.text

        googleName.setOnFocusChangeListener { view, focus ->
            if (focus) {
                googleName.setBackgroundColor(getColor(R.color.transparent))
            }
        }


        googleSurName.setOnFocusChangeListener { view, focus ->
            if (focus) {
                googleSurName.setBackgroundColor(getColor(R.color.transparent))
            }
        }


        bottomNext1.setOnClickListener {
            if (name2.isEmpty() || surName2.isEmpty()) {
                if (name2.isEmpty()) googleName.setBackgroundColor(getColor(R.color.lightRed))
                if (surName2.isEmpty()) googleSurName.setBackgroundColor(getColor(R.color.lightRed))
            } else {
                val intent3 = Intent(this, GoogleActivity3::class.java)
                intent3.putExtra("googleEditName", name2)
                intent3.putExtra("googleEditSurName", surName2)
                startActivity(intent3)
            }
        }


        bottomBack.setOnClickListener {
            val intent2 = Intent(this, GoogleActivity::class.java)
            startActivity(intent2)
        }

    }
}