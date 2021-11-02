package com.example.assignment_test_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnTrunk : Button
    lateinit var btnButt : Button
    lateinit var btnClap : Button
    lateinit var btnArm : Button
    lateinit var btnKick : Button
    lateinit var btnSwimmer : Button
    lateinit var btnPlank : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTrunk = findViewById(R.id.btnTrunk)
        btnButt = findViewById(R.id.btnButt)
        btnClap = findViewById(R.id.btnClap)
        btnArm = findViewById(R.id.btnArm)
        btnKick = findViewById(R.id.btnKick)
        btnSwimmer = findViewById(R.id.btnSwimmer)
        btnPlank = findViewById(R.id.btnPlank)

        btnTrunk.setOnClickListener {
            val intent = Intent(this, Activity_Trunk::class.java)
            startActivity(intent)
        }

        btnButt.setOnClickListener {
            val intent = Intent(this, Activity_Butt::class.java)
            startActivity(intent)
        }

        btnClap.setOnClickListener {
            val intent = Intent(this, Activity_Clap::class.java)
            startActivity(intent)
        }

        btnArm.setOnClickListener {
            val intent = Intent(this, Activity_Arm::class.java)
            startActivity(intent)
        }

        btnKick.setOnClickListener {
            val intent = Intent(this, Activity_Kick::class.java)
            startActivity(intent)
        }

        btnSwimmer.setOnClickListener {
            val intent = Intent(this, Activity_Swimmer::class.java)
            startActivity(intent)
        }

        btnPlank.setOnClickListener {
            val intent = Intent(this, Activity_Plank::class.java)
            startActivity(intent)
        }
    }



}