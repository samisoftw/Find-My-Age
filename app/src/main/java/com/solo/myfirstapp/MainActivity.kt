package com.solo.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnOutput.setOnClickListener{
            val UserInput:Int= Integer.parseInt(DataInput.text.toString())
            val UserInput1 =DataInput.text.toString()
            val currentYear:Int= Calendar.getInstance().get(Calendar.YEAR)
            val UserAge= currentYear - UserInput
            if(UserInput>currentYear || UserInput==0) {DataOutput.text ="error try again" }
            else if(UserInput==currentYear ) {DataOutput.text="Your age is: less than 1 Year" }
            else if(UserInput1 =="") { Toast.makeText(this,"Please enter birth year",Toast.LENGTH_SHORT).show() }
            else {DataOutput.text="Your age is: $UserAge Years"}
            }

        }
    }



