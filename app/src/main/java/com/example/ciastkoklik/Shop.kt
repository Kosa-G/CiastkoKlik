package com.example.ciastkoklik

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.ciastkoklik.databinding.ActivityMainBinding

open class Shop : MainActivity() {



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shop_main)


        val gotomainbutton: ImageView = findViewById(R.id.gotomainbutton)
        val cost_1: ImageView = findViewById(R.id.cost_1)
        val cost_2: ImageView = findViewById(R.id.cost_2)
        val cookieupgradecost: TextView = findViewById(R.id.cookieupgradecost)
        val passiveupgradecost: TextView = findViewById(R.id.passiveupgradecost)

        cookieupgradecost.text = "$cost1"
        passiveupgradecost.text = "$cost2"


        gotomainbutton.setOnClickListener {
            finish()
        }
        cost_1.setOnClickListener {
            cookup()
        }
        cost_2.setOnClickListener {
            passup()
        }
    }
}

