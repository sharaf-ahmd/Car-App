package com.example.labexam

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pbtnhome =findViewById<LinearLayout>(R.id.fbtn1)
        val pbtnfav=findViewById<LinearLayout>(R.id.fbtn2)
        val pbtnexp=findViewById<LinearLayout>(R.id.fbtn3)

        pbtnhome.setOnClickListener {
            val intent = Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

        pbtnfav.setOnClickListener{
            val intent = Intent(this, favourites::class.java)
            startActivity(intent)

        }

        pbtnexp.setOnClickListener{
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }


        }

}