package com.example.androidlessons

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n", "ResourceAsColor")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameis = findViewById<TextView>(R.id.name_is)
        val imageText = findViewById<TextView>(R.id.image_text)
        val image = findViewById<ImageView>(R.id.image_light)
        imageText.setTextColor(Color.parseColor("#FFFFFFFF"))

        var check = true


        nameis.visibility = View.INVISIBLE
        imageText.setOnClickListener {
            if (check) {
                imageText.setTextColor(Color.parseColor("#FFFFFFFF"))
                image.visibility = View.INVISIBLE
                imageText.visibility = View.INVISIBLE
                nameis.visibility = View.VISIBLE
                nameis.setTextColor(Color.parseColor("#FFFF0000"))
                check = false
            }
        }
        nameis.setOnClickListener {
            if (!check) {
                nameis.visibility = View.INVISIBLE
                imageText.visibility = View.VISIBLE
                image.visibility = View.VISIBLE
                check = true
            }
        }
    }
}

