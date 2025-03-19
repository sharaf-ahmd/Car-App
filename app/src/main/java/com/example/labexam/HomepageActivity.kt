package com.example.labexam

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.homepage)
        val hbtnexplore =findViewById<LinearLayout>(R.id.hpbtn3)
        val hbtnfav=findViewById<LinearLayout>(R.id.hpbtn2)
        val hbtnprof=findViewById<LinearLayout>(R.id.hpbtn4)

        hbtnexplore.setOnClickListener {
            val intent = Intent(this, Explore_page::class.java)
            startActivity(intent)
        }

        hbtnfav.setOnClickListener{
            val intent =Intent(this, favourites::class.java)
            startActivity(intent)

        }

        hbtnprof.setOnClickListener{
            val intent =Intent(this, Profile::class.java)
            startActivity(intent)

        }



        }
    }
