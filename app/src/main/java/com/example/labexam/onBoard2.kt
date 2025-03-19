package com.example.labexam

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onBoard2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board2)
        val getNext2 =findViewById<ConstraintLayout>(R.id.next2)
        val getSkip2 =findViewById<ConstraintLayout>(R.id.skip2)

        getNext2.setOnClickListener{
            val intent = Intent(this, onBoard3::class.java)
            startActivity(intent)

        }

        getSkip2.setOnClickListener{
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)

        }
    }
}