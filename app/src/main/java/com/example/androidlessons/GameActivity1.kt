package com.example.androidlessons

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi

class GameActivity1 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)


        val buttonStart = findViewById<TextView>(R.id.start)
        val question = findViewById<TextView>(R.id.question)
        val answer1 = findViewById<TextView>(R.id.answer1)
        val answer2 = findViewById<TextView>(R.id.answer2)
        val answer3 = findViewById<TextView>(R.id.answer3)
        val answer4 = findViewById<TextView>(R.id.answer4)
        val counter = findViewById<TextView>(R.id.counter)
        val end = findViewById<TextView>(R.id.end)
        val buttonRestart = findViewById<ImageView>(R.id.restart)
        end.text = "Դուք հավաքել եք $counter միավոր"
        var number = 0

        buttonRestart.setBackgroundColor(getColor(R.color.game1))
        end.visibility = View.INVISIBLE
        buttonRestart.visibility = View.INVISIBLE
        counter.visibility = View.INVISIBLE
        answer1.visibility = View.INVISIBLE
        answer2.visibility = View.INVISIBLE
        answer3.visibility = View.INVISIBLE
        answer4.visibility = View.INVISIBLE
        question.visibility = View.INVISIBLE

        buttonStart.setOnClickListener {
            counter.visibility = View.VISIBLE
            answer1.visibility = View.VISIBLE
            answer2.visibility = View.VISIBLE
            answer3.visibility = View.VISIBLE
            answer4.visibility = View.VISIBLE
            question.visibility = View.VISIBLE
            buttonStart.visibility = View.INVISIBLE
            question.text = "Ով մատնեց Հիսուսին"
            answer1.text = "Հուդան"
            answer2.text = "Մատթեոսը"
            answer3.text = "Թովմասը"
            answer4.text = "Պետրոսը"
        }

        buttonRestart.setOnClickListener {
            number = 0
            counter.text = counter.text.toString().toInt().div(1000).toString()
            end.visibility = View.INVISIBLE
            buttonRestart.visibility = View.INVISIBLE
            buttonStart.visibility = View.VISIBLE
        }

        answer1.setOnClickListener {
            when (number) {
                0 -> {
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = "Ով ուրացավ Հիսուսին"
                    answer1.text = "Թովմասը"
                    answer2.text = "Սողոսը"
                    answer3.text = "Պետրոսը"
                    answer4.text = "Հուդան"
                    number += 1
                }
                1 -> {
                    question.text =
                        "Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած"
                    answer1.text = "Հովնանի"
                    answer2.text = "Հովհաննեսի"
                    answer3.text = "Պիսկիղայի"
                    answer4.text = "Անանիայի"
                    number += 1
                }
                2 -> {
                    answer1.text = "130"
                    answer2.text = "100"
                    answer3.text = "125"
                    answer4.text = "120"
                    number += 1
                }
                3 -> {
                    question.text = "Քանի որդի ուներ Նոյը"
                    answer1.text = "1"
                    answer2.text = "5"
                    answer3.text = "10"
                    answer4.text = "3"
                    number += 1
                }
                4 -> {
                    question.text = "ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը"
                    answer1.text = "Բէովր"
                    answer2.text = "Ամրամ"
                    answer3.text = "Նավե"
                    answer4.text = "Մաղքոս"
                    number += 1
                }
                5 -> {
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                }
            }
        }

        answer2.setOnClickListener {
            when (number) {
                0 -> {
                    question.text = "Ով ուրացավ Հիսուսին"
                    answer1.text = "Թովմասը"
                    answer2.text = "Սողոսը"
                    answer3.text = "Պետրոսը"
                    answer4.text = "Հուդան"
                    number += 1
                }
                1 -> {
                    question.text =
                        "Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած"
                    answer1.text = "Հովնանի"
                    answer2.text = "Հովհաննեսի"
                    answer3.text = "Պիսկիղայի"
                    answer4.text = "Անանիայի"
                    number += 1
                }
                2 -> {
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = "Քանի տարեկանում մահացավ Մովսեսը"
                    answer1.text = "130"
                    answer2.text = "100"
                    answer3.text = "125"
                    answer4.text = "120"
                    number += 1
                }
                3 -> {
                    question.text = "Քանի որդի ուներ Նոյը"
                    answer1.text = "1"
                    answer2.text = "5"
                    answer3.text = "10"
                    answer4.text = "3"
                    number += 1
                }
                4 -> {
                    question.text = "ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը"
                    answer1.text = "Բէովր"
                    answer2.text = "Ամրամ"
                    answer3.text = "Նավե"
                    answer4.text = "Մաղքոս"
                    number += 1
                }
                5 -> {
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                }
            }
        }

        answer3.setOnClickListener {
            when (number) {
                0 -> {
                    question.text = "Ով ուրացավ Հիսուսին"
                    answer1.text = "Թովմասը"
                    answer2.text = "Սողոսը"
                    answer3.text = "Պետրոսը"
                    answer4.text = "Հուդան"
                    number += 1
                }
                1 -> {
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text =
                        "Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած"
                    answer1.text = "Հովնանի"
                    answer2.text = "Հովհաննեսի"
                    answer3.text = "Պիսկիղայի"
                    answer4.text = "Անանիայի"
                    number += 1
                }
                2 -> {
                    question.text = "Քանի տարեկանում մահացավ Մովսեսը"
                    answer1.text = "130"
                    answer2.text = "100"
                    answer3.text = "125"
                    answer4.text = "120"
                    number += 1
                }
                3 -> {
                    question.text = "Քանի որդի ուներ Նոյը"
                    answer1.text = "1"
                    answer2.text = "5"
                    answer3.text = "10"
                    answer4.text = "3"
                    number += 1
                }
                4 -> {
                    question.text = "ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը"
                    answer1.text = "Բէովր"
                    answer2.text = "Ամրամ"
                    answer3.text = "Նավե"
                    answer4.text = "Մաղքոս"
                    number += 1
                }
                5 -> {
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                }
            }
        }

        answer4.setOnClickListener {
            when (number) {
                0 -> {
                    question.text = "Ով ուրացավ Հիսուսին"
                    answer1.text = "Թովմասը"
                    answer2.text = "Սողոսը"
                    answer3.text = "Պետրոսը"
                    answer4.text = "Հուդան"
                    number += 1
                }
                1 -> {
                    question.text =
                        "Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած"
                    answer1.text = "Հովնանի"
                    answer2.text = "Հովհաննեսի"
                    answer3.text = "Պիսկիղայի"
                    answer4.text = "Անանիայի"
                    number += 1
                }
                2 -> {
                    question.text = "Քանի տարեկանում մահացավ Մովսեսը"
                    answer1.text = "130"
                    answer2.text = "100"
                    answer3.text = "125"
                    answer4.text = "120"
                    number += 1
                }
                3 -> {
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = "Քանի որդի ուներ Նոյը"
                    answer1.text = "1"
                    answer2.text = "5"
                    answer3.text = "10"
                    answer4.text = "3"
                    number += 1
                }
                4 -> {
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = "ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը"
                    answer1.text = "Բէովր"
                    answer2.text = "Ամրամ"
                    answer3.text = "Նավե"
                    answer4.text = "Մաղքոս"
                    number += 1
                }
                5 -> {
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                }
            }
        }


    }
}


