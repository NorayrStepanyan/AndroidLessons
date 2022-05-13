package com.example.androidlessons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonEnter = findViewById<Button>(R.id.enter_button1)
        val nameHello = findViewById<TextView>(R.id.hello)
        val plus = findViewById<TextView>(R.id.plus)
        val minus = findViewById<TextView>(R.id.minus)
        val number = findViewById<TextView>(R.id.number11)
        val home = findViewById<TextView>(R.id.home)
        var check = true


        buttonEnter.setOnClickListener {
            if (check) {
                nameHello.setText(getText(R.string.name_noro))
                check = false
            } else {
                nameHello.setText(getText(R.string.name_hayk))
                check = true
            }
        }


        plus.setOnClickListener {
            number.text = number.text.toString().toInt().plus(1).toString()

        }
        minus.setOnClickListener {
            number.text = number.text.toString().toInt().minus(1).toString()

        }


        home.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }
    }
}
