package com.example.mypracticumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnMainScreen=findViewById<Button>(R.id.btnMainScreen) 
         val btnExit=findViewById<Button>(R.id.btnExit)
        
        btnMainScreen?.setOnClickListener { 
        val intent= Intent(this, MainActivity4::class.java)
            startActivity(intent)
            
        }
    }
}