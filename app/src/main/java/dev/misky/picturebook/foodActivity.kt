package dev.misky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class foodActivity : AppCompatActivity() {
    lateinit var btnNEXT: Button
    lateinit var btnPreview: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        btnNEXT = findViewById(R.id.btnNEXT)
        btnNEXT.setOnClickListener {
            val intent = Intent(this, food2Activity::class.java)
            startActivity(intent)
        }
        btnPreview = findViewById(R.id.btnPreview)
        btnPreview.setOnClickListener {
            val intent = Intent(this, coffeeActivity::class.java)
            startActivity(intent)
        }
    }
}