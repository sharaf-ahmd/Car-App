package com.example.labexam


import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import android.content.Intent
import androidx.constraintlayout.widget.ConstraintLayoutStates
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val getStart =findViewById<ConstraintLayout>(R.id.btn1)
        getStart.setOnClickListener{
            val intent = Intent(this, onBoard1::class.java)
            startActivity(intent)

        }
        }
    }
