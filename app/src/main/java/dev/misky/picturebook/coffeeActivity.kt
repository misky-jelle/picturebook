package dev.misky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class coffeeActivity : AppCompatActivity() {
    lateinit var btnNext: Button
    lateinit var btnpreview:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coffee)
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener{
            val intent = Intent (this,foodActivity ::class.java)
            startActivity(intent)
        }
        btnpreview= findViewById(R.id.btnpreview)
        btnpreview.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    }
