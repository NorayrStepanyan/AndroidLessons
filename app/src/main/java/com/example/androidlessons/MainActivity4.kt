package com.example.androidlessons

import android.content.Intent
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextClock

import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity4 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val name = findViewById<TextView>(R.id.name)
        val surName = findViewById<TextView>(R.id.surname)
        val next = findViewById<TextView>(R.id.next)
        val editName = findViewById<TextView>(R.id.editName)
        val editSurName = findViewById<TextView>(R.id.editSurName)
        val buttonOk = findViewById<TextView>(R.id.buttonOk)
        val text1 = findViewById<TextView>(R.id.nameText)
        val text2 = findViewById<TextView>(R.id.surNameText)
        val name2 = editName.text
        val surName2 = editSurName.text
        var textInputState = true

        next.visibility = View.INVISIBLE
        buttonOk.visibility = View.VISIBLE
        text1.visibility = View.INVISIBLE
        text2.visibility = View.INVISIBLE
        buttonOk.setBackgroundColor(getColor(R.color.white2))




        buttonOk.setOnClickListener {
            buttonOk.setBackgroundColor(getColor(R.color.black))

            text1.text = name2
            text2.text = surName2
            if (textInputState) {
                buttonOk.setTextColor(getColor(R.color.red))
                buttonOk.setText(R.string.buttonBack)
                name.visibility = View.INVISIBLE
                surName.visibility = View.INVISIBLE
                editName.visibility = View.INVISIBLE
                editSurName.visibility = View.INVISIBLE
                text1.visibility = View.VISIBLE
                text2.visibility = View.VISIBLE
                editName.visibility = View.INVISIBLE
                next.visibility = View.VISIBLE
                textInputState = false

                next.setOnClickListener {
                    val intent = Intent(this, MainActivity3::class.java)
                    intent.putExtra("name", name2)
                    intent.putExtra("surName", surName2)
                    startActivity(intent)
                }
            } else {
                buttonOk.setText(R.string.buttonOk)
                buttonOk.setTextColor(getColor(R.color.teal_700))
                name.visibility = View.VISIBLE
                surName.visibility = View.VISIBLE
                editName.visibility = View.VISIBLE
                editSurName.visibility = View.VISIBLE
                text1.visibility = View.INVISIBLE
                text2.visibility = View.INVISIBLE
                editName.visibility = View.VISIBLE
                next.visibility = View.INVISIBLE
                textInputState = true
            }
        }
    }
}