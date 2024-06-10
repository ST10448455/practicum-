@file:Suppress("UNUSED_VARIABLE", "LocalVariableName")

package com.example.mypracticumexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val validDays =
            arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val validMinTemperature = arrayOf("12", "15", "15", "13", "17", "10", "10")
        val validMaxTemperature = arrayOf("25", "29", "22", "19", "20", "18", "16")
        val validWeatherCondition =
            arrayOf("Sunny", "Sunny", "Windy", "Windy", "Sunny", "Raining", "Cold")




        }
    }