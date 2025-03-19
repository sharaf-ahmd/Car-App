package com.example.labexam

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class favourites : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val fbtnhome =findViewById<LinearLayout>(R.id.fbtn1)
        val fbtnexp=findViewById<LinearLayout>(R.id.fbtn3)
        val fbtnprof=findViewById<LinearLayout>(R.id.fbtn4)

        fbtnhome.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        fbtnexp.setOnClickListener{
            val intent = Intent(this, Explore_page::class.java)
            startActivity(intent)

        }

        fbtnprof.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }

    }
}