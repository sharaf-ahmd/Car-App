package com.example.labexam

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onBoard1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_board1)
        val getNext1 =findViewById<ConstraintLayout>(R.id.next1)
        val getSkip1 =findViewById<ConstraintLayout>(R.id.skip1)

        getNext1.setOnClickListener{
            val intent = Intent(this, onBoard2::class.java)
            startActivity(intent)

        }

        getSkip1.setOnClickListener{
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)

        }

    }
}