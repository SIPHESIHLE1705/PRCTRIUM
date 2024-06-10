# PRCTRIUM
package com.example.practicumassesment2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_splashscreen)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val exitButton = findViewById<Button>(R.id.btnExit)






        

        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {

        }
    }
}


pseudocode
        0.start
        delcarations 
        varbuttonNext,varbtnExit,string studentname and appname,string studentumber,app logo
        if btnNext is clicked 
        display mainscreen 
        else exit the app 
        calculate the average 
        show the array data of the week 
        stop 




![image](https://github.com/SIPHESIHLE1705/PRCTRIUM/assets/162302326/c4fb2fc9-cfc3-45c8-8e8b-28acb7d8ca93)



         




