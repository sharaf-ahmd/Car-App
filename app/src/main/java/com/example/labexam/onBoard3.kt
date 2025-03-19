package com.example.labexam

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onBoard3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board3)
        val getNext3 =findViewById<ConstraintLayout>(R.id.next3)

        getNext3.setOnClickListener{
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)

        }

        }

}