package com.example.androidlessons

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
        val editName = findViewById<TextView>(R.id.editName)
        val editSurName = findViewById<TextView>(R.id.editSurName)
        val buttonOk = findViewById<TextView>(R.id.buttonOk)
        val text1 = findViewById<TextView>(R.id.nameText)
        val text2 = findViewById<TextView>(R.id.surNameText)
        var textInputState = true


        buttonOk.visibility = View.VISIBLE
        text1.visibility = View.INVISIBLE
        text2.visibility = View.INVISIBLE
        buttonOk.setBackgroundColor(getColor(R.color.white))

        buttonOk.setOnClickListener {
            val name2 = editName.text
            val surName2 = editSurName.text
            if (textInputState) {
                buttonOk.setTextColor(getColor(R.color.red))
                text1.text = name2
                text2.text = surName2
                buttonOk.setText(R.string.back)
                name.visibility = View.INVISIBLE
                surName.visibility = View.INVISIBLE
                editName.visibility = View.INVISIBLE
                editSurName.visibility = View.INVISIBLE
                text1.visibility = View.VISIBLE
                text2.visibility = View.VISIBLE
                editName.visibility = View.INVISIBLE
                textInputState = false
            } else {
                buttonOk.setText(R.string.ok)
                buttonOk.setTextColor(getColor(R.color.teal_700))
                name.visibility = View.VISIBLE
                surName.visibility = View.VISIBLE
                editName.visibility = View.VISIBLE
                editSurName.visibility = View.VISIBLE
                text1.visibility = View.INVISIBLE
                text2.visibility = View.INVISIBLE
                editName.visibility = View.VISIBLE
                textInputState = true
            }
        }
    }
}