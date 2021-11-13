package com.example.caassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class SecondQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_question)

        val rdBtn1 = findViewById<RadioButton>(R.id.rdBtn1)
        val rdBtn2 = findViewById<RadioButton>(R.id.rdBtn2)
        val rdBtn3 = findViewById<RadioButton>(R.id.rdBtn3)
        val chBox1 = findViewById<CheckBox>(R.id.chBox1)
        val chBox2 = findViewById<CheckBox>(R.id.chBox2)
        val chBox3 = findViewById<CheckBox>(R.id.chBox3)
        val chBox4 = findViewById<CheckBox>(R.id.chBox4)
        val chBox5 = findViewById<CheckBox>(R.id.chBox5)
        val subBtn = findViewById<Button>(R.id.subBtn)

        rdBtn1.setOnClickListener{
            Toast.makeText(this, "CSE", Toast.LENGTH_LONG).show()
        }

        rdBtn2.setOnClickListener{
            Toast.makeText(this, "ECE", Toast.LENGTH_LONG).show()
        }

        rdBtn3.setOnClickListener{
            Toast.makeText(this, "ME", Toast.LENGTH_LONG).show()
        }

        chBox1.setOnClickListener {
            Toast.makeText(this, "Android", Toast.LENGTH_LONG).show()
        }

        chBox2.setOnClickListener {
            Toast.makeText(this, "Machine Learning", Toast.LENGTH_LONG).show()
        }

        chBox3.setOnClickListener {
            Toast.makeText(this, "Data Science", Toast.LENGTH_LONG).show()
        }

        chBox4.setOnClickListener {
            Toast.makeText(this, "Engineering Mathematics", Toast.LENGTH_LONG).show()
        }

        chBox5.setOnClickListener {
            Toast.makeText(this, "Engineering Physics", Toast.LENGTH_LONG).show()
        }


        subBtn.setOnClickListener {
            Toast.makeText(this, "Your response has been submitted", Toast.LENGTH_LONG).show()
        }

    }
}