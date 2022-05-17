package com.example.androidlessons

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import org.w3c.dom.Text
import kotlin.math.ceil

class GameActivity1 : AppCompatActivity() {
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
        val End = findViewById<TextView>(R.id.end)
        val buttonRestart = findViewById<ImageView>(R.id.restart)
        End.setText("Դուք հավաքել եք $counter միավոր")
        val text = End
        var number = 0

        buttonRestart.setBackgroundColor(getColor(R.color.game1))
        End.visibility = View.INVISIBLE
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
            question.setText("Ով մատնեց Հիսուսին")
            answer1.setText("Հուդան")
            answer2.setText("Մատթեոսը")
            answer3.setText("Թովմասը")
            answer4.setText("Պետրոսը")
        }

        buttonRestart.setOnClickListener {
            number = 0
            counter.text = counter.text.toString().toInt().div(1000).toString()
            text.visibility = View.INVISIBLE
            buttonRestart.visibility = View.INVISIBLE
            buttonStart.visibility = View.VISIBLE
        }

        answer1.setOnClickListener {
            if (number == 0) {
                counter.text = counter.text.toString().toInt().plus(5).toString()
                question.setText("Ով ուրացավ Հիսուսին")
                answer1.setText("Թովմասը")
                answer2.setText("Սողոսը")
                answer3.setText("Պետրոսը")
                answer4.setText("Հուդան")
                number += 1
            } else if (number == 1) {
                question.setText("Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած")
                answer1.setText("Հովնանի")
                answer2.setText("Հովհաննեսի")
                answer3.setText("Պիսկիղայի")
                answer4.setText("Անանիայի")
                number += 1
            } else if (number == 2) {
                answer1.setText("130")
                answer2.setText("100")
                answer3.setText("125")
                answer4.setText("120")
                number += 1
            } else if (number == 3) {
                question.setText("Քանի որդի ուներ Նոյը")
                answer1.setText("1")
                answer2.setText("5")
                answer3.setText("10")
                answer4.setText("3")
                number += 1
            } else if (number == 4) {
                question.setText("ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը")
                answer1.setText("Բէովր")
                answer2.setText("Ամրամ")
                answer3.setText("Նավե")
                answer4.setText("Մաղքոս")
                number += 1
            } else if (number == 5) {
                text.visibility = View.VISIBLE
                buttonRestart.visibility = View.VISIBLE
                answer1.visibility = View.INVISIBLE
                answer2.visibility = View.INVISIBLE
                answer3.visibility = View.INVISIBLE
                answer4.visibility = View.INVISIBLE
                question.visibility = View.INVISIBLE
                buttonStart.visibility = View.INVISIBLE
            }
        }

        answer2.setOnClickListener {
            if (number == 0) {
                question.setText("Ով ուրացավ Հիսուսին")
                answer1.setText("Թովմասը")
                answer2.setText("Սողոսը")
                answer3.setText("Պետրոսը")
                answer4.setText("Հուդան")
                number += 1
            } else if (number == 1) {
                question.setText("Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած")
                answer1.setText("Հովնանի")
                answer2.setText("Հովհաննեսի")
                answer3.setText("Պիսկիղայի")
                answer4.setText("Անանիայի")
                number += 1
            } else if (number == 2) {
                counter.text = counter.text.toString().toInt().plus(5).toString()
                question.setText("Քանի տարեկանում մահացավ Մովսեսը")
                answer1.setText("130")
                answer2.setText("100")
                answer3.setText("125")
                answer4.setText("120")
                number += 1
            } else if (number == 3) {
                question.setText("Քանի որդի ուներ Նոյը")
                answer1.setText("1")
                answer2.setText("5")
                answer3.setText("10")
                answer4.setText("3")
                number += 1
            } else if (number == 4) {
                question.setText("ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը")
                answer1.setText("Բէովր")
                answer2.setText("Ամրամ")
                answer3.setText("Նավե")
                answer4.setText("Մաղքոս")
                number += 1
            } else if (number == 5) {
                text.visibility = View.VISIBLE
                buttonRestart.visibility = View.VISIBLE
                answer1.visibility = View.INVISIBLE
                answer2.visibility = View.INVISIBLE
                answer3.visibility = View.INVISIBLE
                answer4.visibility = View.INVISIBLE
                question.visibility = View.INVISIBLE
                buttonStart.visibility = View.INVISIBLE
            }
        }

        answer3.setOnClickListener {
            if (number == 0) {
                question.setText("Ով ուրացավ Հիսուսին")
                answer1.setText("Թովմասը")
                answer2.setText("Սողոսը")
                answer3.setText("Պետրոսը")
                answer4.setText("Հուդան")
                number += 1
            } else if (number == 1) {
                counter.text = counter.text.toString().toInt().plus(5).toString()
                question.setText("Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած")
                answer1.setText("Հովնանի")
                answer2.setText("Հովհաննեսի")
                answer3.setText("Պիսկիղայի")
                answer4.setText("Անանիայի")
                number += 1
            } else if (number == 2) {
                question.setText("Քանի տարեկանում մահացավ Մովսեսը")
                answer1.setText("130")
                answer2.setText("100")
                answer3.setText("125")
                answer4.setText("120")
                number += 1
            } else if (number == 3) {
                question.setText("Քանի որդի ուներ Նոյը")
                answer1.setText("1")
                answer2.setText("5")
                answer3.setText("10")
                answer4.setText("3")
                number += 1
            } else if (number == 4) {
                question.setText("ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը")
                answer1.setText("Բէովր")
                answer2.setText("Ամրամ")
                answer3.setText("Նավե")
                answer4.setText("Մաղքոս")
                number += 1
            } else if (number == 5) {
                text.visibility = View.VISIBLE
                buttonRestart.visibility = View.VISIBLE
                answer1.visibility = View.INVISIBLE
                answer2.visibility = View.INVISIBLE
                answer3.visibility = View.INVISIBLE
                answer4.visibility = View.INVISIBLE
                question.visibility = View.INVISIBLE
                buttonStart.visibility = View.INVISIBLE
            }
        }

        answer4.setOnClickListener {
            if (number == 0) {
                question.setText("Ով ուրացավ Հիսուսին")
                answer1.setText("Թովմասը")
                answer2.setText("Սողոսը")
                answer3.setText("Պետրոսը")
                answer4.setText("Հուդան")
                number += 1
            } else if (number == 1) {
                question.setText("Ում մասին էր վկայում Հիսուսը <Ճշմարիտ ասում եմ ձեզ այստեղ կանգնածներից ոմանք կան,որ մահ չեն տեսնի, մինչև որ չտեսնեն Աստծո արքայությունը եկած")
                answer1.setText("Հովնանի")
                answer2.setText("Հովհաննեսի")
                answer3.setText("Պիսկիղայի")
                answer4.setText("Անանիայի")
                number += 1
            } else if (number == 2) {
                question.setText("Քանի տարեկանում մահացավ Մովսեսը")
                answer1.setText("130")
                answer2.setText("100")
                answer3.setText("125")
                answer4.setText("120")
                number += 1
            } else if (number == 3) {
                counter.text = counter.text.toString().toInt().plus(5).toString()
                question.setText("Քանի որդի ուներ Նոյը")
                answer1.setText("1")
                answer2.setText("5")
                answer3.setText("10")
                answer4.setText("3")
                number += 1
            } else if (number == 4) {
                counter.text = counter.text.toString().toInt().plus(5).toString()
                question.setText("ինչ էր այն ծառայի անունը որի ականջը կտրեց Պետրոսը")
                answer1.setText("Բէովր")
                answer2.setText("Ամրամ")
                answer3.setText("Նավե")
                answer4.setText("Մաղքոս")
                number += 1
            } else if (number == 5) {
                counter.text = counter.text.toString().toInt().plus(5).toString()
                text.visibility = View.VISIBLE
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


