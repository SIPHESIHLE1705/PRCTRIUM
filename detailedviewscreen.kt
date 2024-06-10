package com.example.practicumassesment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class detailedviewscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailedviewscreen)
        //screen showing detalied informtion for each day days temperture
        
        val days :Array<(OUT)=intent.getStringArrayExtra(name:"days")
        val min :ArrayList<int!>?=intent.getStringArrayExtra(name:"min")
        val max:ArrayList<int!>/?=intent.getStringArrayExtra(name:"mix")
        val conditions:Array<(Out)sting>/=intent.getIntArrayExtra(name:"conditions ")






    }
        }


