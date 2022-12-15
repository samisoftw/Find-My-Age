package com.solo.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BtnOutput.setOnClickListener{
            val UserInput:Int= Integer.parseInt(DataInput.text.toString())
            val currentYear:Int= Calendar.getInstance().get(Calendar.YEAR)
            val UserAge= currentYear - UserInput
            DataOutput.text="Your age is: $UserAge Years"

        }
    }
}