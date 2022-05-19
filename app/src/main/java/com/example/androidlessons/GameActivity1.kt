package com.example.androidlessons

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi

//import kotlin.random.Random

class GameActivity1 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game1)

        var number = 0
//        val randomValues = List(2) { Random.nextInt(0, 1) }
        val sadSmile = findViewById<ImageView>(R.id.sadSmile)
        val happySmile = findViewById<ImageView>(R.id.happySmile)
        val smile = findViewById<ImageView>(R.id.smile)
        val buttonStart = findViewById<TextView>(R.id.start)
        val question = findViewById<TextView>(R.id.question)
        val answer1 = findViewById<TextView>(R.id.answer1)
        val answer2 = findViewById<TextView>(R.id.answer2)
        val answer3 = findViewById<TextView>(R.id.answer3)
        val answer4 = findViewById<TextView>(R.id.answer4)
        val counter = findViewById<TextView>(R.id.counter)
        val end = findViewById<TextView>(R.id.end)
        val buttonRestart = findViewById<ImageView>(R.id.restart)
        val questionList = arrayListOf(
            "Ով մատնեց Հիսուսին",
            "Ով ուրացավ Հիսուսին",
            "Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած",
            "Քանի տարեկանում մահացավ Մովսեսը",
            "Քանի որդի ուներ Նոյը",
            "ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը",
            "Ով էր Հակոբի աները",
            "Նոյի որդիներն են Սեմը, Քամը, ․․․",
            "Պողոսի իրական անունը",
            "Նոյի հոր անունը"
        )
        val answerList1 =
            arrayListOf(
                "Հուդան",
                "Թովմասը",
                "Հովնանի",
                "130",
                "1",
                "Բէովր",
                "Բաղամը",
                "Հաբեթը",
                "Ղուկաս",
                "Աբրահամ"
            )
        val answerList2 =
            arrayListOf(
                "Մատթեոսը",
                "Սողոսը",
                "Հովհաննեսի",
                "100",
                "5",
                "Ամրամ",
                "Լաբանը",
                "Իսմայելը",
                "Սեհոն",
                "Ղամեք"
            )
        val answerList3 =
            arrayListOf(
                "Թովմասը",
                "Պետրոսը",
                "Պիսկիղայի",
                "125",
                "10",
                "Նավե",
                "Բաղակը",
                "Կայենը",
                "Սողոս",
                "Ղովտ"
            )
        val answerList4 =
            arrayListOf(
                "Պետրոսը",
                "Հուդան",
                "Անանիայի",
                "120",
                "3",
                "Մաղքոս",
                "Մելքիսեդեկը",
                "Ղամեքը",
                "Հեղի",
                "Հաբիե"
            )


        smile.visibility = View.INVISIBLE
        sadSmile.visibility = View.INVISIBLE
        happySmile.visibility = View.INVISIBLE
        end.visibility = View.INVISIBLE
        buttonRestart.visibility = View.INVISIBLE
        counter.visibility = View.INVISIBLE
        answer1.visibility = View.INVISIBLE
        answer2.visibility = View.INVISIBLE
        answer3.visibility = View.INVISIBLE
        answer4.visibility = View.INVISIBLE
        question.visibility = View.INVISIBLE
        end.setTextColor(getColor(R.color.white2))

        buttonStart.setOnClickListener {
            smile.visibility = View.VISIBLE
            counter.visibility = View.VISIBLE
            answer1.visibility = View.VISIBLE
            answer2.visibility = View.VISIBLE
            answer3.visibility = View.VISIBLE
            answer4.visibility = View.VISIBLE
            question.visibility = View.VISIBLE
            buttonStart.visibility = View.INVISIBLE
            question.text = questionList[0]
            answer1.text = answerList1[0]
            answer2.text = answerList2[0]
            answer3.text = answerList3[0]
            answer4.text = answerList4[0]
        }

        buttonRestart.setOnClickListener {
            number = 1
            counter.text = "0"
            end.visibility = View.INVISIBLE
            counter.visibility = View.INVISIBLE
            buttonRestart.visibility = View.INVISIBLE
            buttonStart.visibility = View.VISIBLE
            smile.visibility = View.INVISIBLE
            sadSmile.visibility = View.INVISIBLE
            happySmile.visibility = View.INVISIBLE
        }

        answer1.setOnClickListener {
            when (number) {
                0 -> {
                    smile.visibility = View.GONE
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[1]
                    answer1.text = answerList1[1]
                    answer2.text = answerList2[1]
                    answer3.text = answerList3[1]
                    answer4.text = answerList4[1]
                    number += 1
                }
                1 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[2]
                    answer1.text = answerList1[2]
                    answer2.text = answerList2[2]
                    answer3.text = answerList3[2]
                    answer4.text = answerList4[2]
                    number += 1
                }
                2 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[3]
                    answer1.text = answerList1[3]
                    answer2.text = answerList2[3]
                    answer3.text = answerList3[3]
                    answer4.text = answerList4[3]
                    number += 1
                }
                3 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[4]
                    answer1.text = answerList1[4]
                    answer2.text = answerList2[4]
                    answer3.text = answerList3[4]
                    answer4.text = answerList4[4]
                    number += 1
                }
                4 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[5]
                    answer1.text = answerList1[5]
                    answer2.text = answerList2[5]
                    answer3.text = answerList3[5]
                    answer4.text = answerList4[5]
                    number += 1
                }
                5 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[6]
                    answer1.text = answerList1[6]
                    answer2.text = answerList2[6]
                    answer3.text = answerList3[6]
                    answer4.text = answerList4[6]
                    number += 1
                }
                6 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[7]
                    answer1.text = answerList1[7]
                    answer2.text = answerList2[7]
                    answer3.text = answerList3[7]
                    answer4.text = answerList4[7]
                    number += 1
                }
                7 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[8]
                    answer1.text = answerList1[8]
                    answer2.text = answerList2[8]
                    answer3.text = answerList3[8]
                    answer4.text = answerList4[8]
                    number += 1
                }
                8 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[9]
                    answer1.text = answerList1[9]
                    answer2.text = answerList2[9]
                    answer3.text = answerList3[9]
                    answer4.text = answerList4[9]
                    number += 1
                }
                9 -> {
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    end.text = "Դուք հավաքել եք ${counter.text} միավոր"
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    counter.visibility = View.INVISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                    if (counter.text.toString().toInt().toString() < 0.toString()) {
                        sadSmile.visibility = View.VISIBLE
                        happySmile.visibility = View.INVISIBLE
                    }
                    if (counter.text.toString().toInt().toString() > 0.toString()) {
                        sadSmile.visibility = View.INVISIBLE
                        happySmile.visibility = View.VISIBLE
                    }
                }
            }
        }

        answer2.setOnClickListener {
            when (number) {
                0 -> {
                    smile.visibility = View.GONE
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[1]
                    answer1.text = answerList1[1]
                    answer2.text = answerList2[1]
                    answer3.text = answerList3[1]
                    answer4.text = answerList4[1]
                    number += 1
                }
                1 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[2]
                    answer1.text = answerList1[2]
                    answer2.text = answerList2[2]
                    answer3.text = answerList3[2]
                    answer4.text = answerList4[2]
                    number += 1
                }
                2 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[3]
                    answer1.text = answerList1[3]
                    answer2.text = answerList2[3]
                    answer3.text = answerList3[3]
                    answer4.text = answerList4[3]
                    number += 1
                }
                3 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[4]
                    answer1.text = answerList1[4]
                    answer2.text = answerList2[4]
                    answer3.text = answerList3[4]
                    answer4.text = answerList4[4]
                    number += 1
                }
                4 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[5]
                    answer1.text = answerList1[5]
                    answer2.text = answerList2[5]
                    answer3.text = answerList3[5]
                    answer4.text = answerList4[5]
                    number += 1
                }
                5 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[6]
                    answer1.text = answerList1[6]
                    answer2.text = answerList2[6]
                    answer3.text = answerList3[6]
                    answer4.text = answerList4[6]
                    number += 1
                }
                6 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[7]
                    answer1.text = answerList1[7]
                    answer2.text = answerList2[7]
                    answer3.text = answerList3[7]
                    answer4.text = answerList4[7]
                    number += 1
                }
                7 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[8]
                    answer1.text = answerList1[8]
                    answer2.text = answerList2[8]
                    answer3.text = answerList3[8]
                    answer4.text = answerList4[8]
                    number += 1
                }
                8 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[9]
                    answer1.text = answerList1[9]
                    answer2.text = answerList2[9]
                    answer3.text = answerList3[9]
                    answer4.text = answerList4[9]
                    number += 1
                }
                9 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    end.text = "Դուք հավաքել եք ${counter.text} միավոր"
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    counter.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                    if (counter.text.toString().toInt().toString() < 0.toString()) {
                        sadSmile.visibility = View.VISIBLE
                        happySmile.visibility = View.INVISIBLE
                    }
                    if (counter.text.toString().toInt().toString() > 0.toString()) {
                        sadSmile.visibility = View.INVISIBLE
                        happySmile.visibility = View.VISIBLE
                    }
                }
            }
        }

        answer3.setOnClickListener {
            when (number) {
                0 -> {
                    smile.visibility = View.GONE
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[1]
                    answer1.text = answerList1[1]
                    answer2.text = answerList2[1]
                    answer3.text = answerList3[1]
                    answer4.text = answerList4[1]
                    number += 1
                }
                1 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[2]
                    answer1.text = answerList1[2]
                    answer2.text = answerList2[2]
                    answer3.text = answerList3[2]
                    answer4.text = answerList4[2]
                    number += 1
                }
                2 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[3]
                    answer1.text = answerList1[3]
                    answer2.text = answerList2[3]
                    answer3.text = answerList3[3]
                    answer4.text = answerList4[3]
                    number += 1
                }
                3 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[4]
                    answer1.text = answerList1[4]
                    answer2.text = answerList2[4]
                    answer3.text = answerList3[4]
                    answer4.text = answerList4[4]
                    number += 1
                }
                4 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[5]
                    answer1.text = answerList1[5]
                    answer2.text = answerList2[5]
                    answer3.text = answerList3[5]
                    answer4.text = answerList4[5]
                    number += 1
                }
                5 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[6]
                    answer1.text = answerList1[6]
                    answer2.text = answerList2[6]
                    answer3.text = answerList3[6]
                    answer4.text = answerList4[6]
                    number += 1
                }
                6 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[7]
                    answer1.text = answerList1[7]
                    answer2.text = answerList2[7]
                    answer3.text = answerList3[7]
                    answer4.text = answerList4[7]
                    number += 1
                }
                7 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[8]
                    answer1.text = answerList1[8]
                    answer2.text = answerList2[8]
                    answer3.text = answerList3[8]
                    answer4.text = answerList4[8]
                    number += 1
                }
                8 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[9]
                    answer1.text = answerList1[9]
                    answer2.text = answerList2[9]
                    answer3.text = answerList3[9]
                    answer4.text = answerList4[9]
                    number += 1
                }
                9 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    end.text = "Դուք հավաքել եք ${counter.text} միավոր"
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    counter.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                    if (counter.text.toString().toInt().toString() < 0.toString()) {
                        sadSmile.visibility = View.VISIBLE
                        happySmile.visibility = View.INVISIBLE
                    }
                    if (counter.text.toString().toInt().toString() > 0.toString()) {
                        sadSmile.visibility = View.INVISIBLE
                        happySmile.visibility = View.VISIBLE
                    }
                }
            }
        }

        answer4.setOnClickListener {
            when (number) {
                0 -> {
                    smile.visibility = View.GONE
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[1]
                    answer1.text = answerList1[1]
                    answer2.text = answerList2[1]
                    answer3.text = answerList3[1]
                    answer4.text = answerList4[1]
                    number += 1
                }
                1 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[2]
                    answer1.text = answerList1[2]
                    answer2.text = answerList2[2]
                    answer3.text = answerList3[2]
                    answer4.text = answerList4[2]
                    number += 1
                }
                2 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[3]
                    answer1.text = answerList1[3]
                    answer2.text = answerList2[3]
                    answer3.text = answerList3[3]
                    answer4.text = answerList4[3]
                    number += 1
                }
                3 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[4]
                    answer1.text = answerList1[4]
                    answer2.text = answerList2[4]
                    answer3.text = answerList3[4]
                    answer4.text = answerList4[4]
                    number += 1
                }
                4 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[5]
                    answer1.text = answerList1[5]
                    answer2.text = answerList2[5]
                    answer3.text = answerList3[5]
                    answer4.text = answerList4[5]
                    number += 1
                }
                5 -> {
                    sadSmile.visibility = View.INVISIBLE
                    happySmile.visibility = View.VISIBLE
                    counter.text = counter.text.toString().toInt().plus(5).toString()
                    question.text = questionList[6]
                    answer1.text = answerList1[6]
                    answer2.text = answerList2[6]
                    answer3.text = answerList3[6]
                    answer4.text = answerList4[6]
                    number += 1
                }
                6 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[7]
                    answer1.text = answerList1[7]
                    answer2.text = answerList2[7]
                    answer3.text = answerList3[7]
                    answer4.text = answerList4[7]
                    number += 1
                }
                7 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[8]
                    answer1.text = answerList1[8]
                    answer2.text = answerList2[8]
                    answer3.text = answerList3[8]
                    answer4.text = answerList4[8]
                    number += 1
                }
                8 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    question.text = questionList[9]
                    answer1.text = answerList1[9]
                    answer2.text = answerList2[9]
                    answer3.text = answerList3[9]
                    answer4.text = answerList4[9]
                    number += 1
                }
                9 -> {
                    sadSmile.visibility = View.VISIBLE
                    happySmile.visibility = View.INVISIBLE
                    counter.text = counter.text.toString().toInt().minus(5).toString()
                    end.text = "Դուք հավաքել եք ${counter.text} միավոր"
                    end.visibility = View.VISIBLE
                    buttonRestart.visibility = View.VISIBLE
                    answer1.visibility = View.INVISIBLE
                    answer2.visibility = View.INVISIBLE
                    answer3.visibility = View.INVISIBLE
                    counter.visibility = View.INVISIBLE
                    answer4.visibility = View.INVISIBLE
                    question.visibility = View.INVISIBLE
                    buttonStart.visibility = View.INVISIBLE
                    if (counter.text.toString().toInt().toString() < 0.toString()) {
                        sadSmile.visibility = View.VISIBLE
                        happySmile.visibility = View.INVISIBLE
                    }
                    if (counter.text.toString().toInt().toString() > 0.toString()) {
                        sadSmile.visibility = View.INVISIBLE
                        happySmile.visibility = View.VISIBLE
                    }
                }
            }
        }


    }
}


