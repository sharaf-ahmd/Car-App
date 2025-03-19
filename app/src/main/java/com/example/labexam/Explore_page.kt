package com.example.labexam

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Explore_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ebtnhome =findViewById<LinearLayout>(R.id.fbtn1)
        val ebtnfav=findViewById<LinearLayout>(R.id.fbtn2)
        val ebtnprof=findViewById<LinearLayout>(R.id.fbtn4)

        ebtnhome.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        ebtnfav.setOnClickListener{
            val intent = Intent(this, favourites::class.java)
            startActivity(intent)

        }

        ebtnprof.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}