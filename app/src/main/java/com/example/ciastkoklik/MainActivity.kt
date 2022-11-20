package com.example.ciastkoklik

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


open class MainActivity : AppCompatActivity() {

    var punkty = 0
    var i = 1
    var cost1 = 10
    var cost2 = 10

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val cookiebutton: ImageView = findViewById(R.id.cookiebutton)
        val points: TextView = findViewById(R.id.points)

            cookiebutton.setOnClickListener {
                punkty = punkty + i
                points.text = "$punkty"
            }

        val gotoshopbutton: ImageView = findViewById(R.id.gotomainbutton2)

        gotoshopbutton.setOnClickListener {
            val intent = Intent(this, Shop::class.java)
            startActivity(intent)
        }

        }

    fun cookup() {
        if (punkty >= cost1) {
            punkty = punkty - cost1
            cost1 = cost1 * 5
            i++
        }
    }

    fun passup(){
        if (punkty >= cost2)
        {
            punkty = punkty - cost2
            cost2 = cost2 * 5

        }
    }
}

