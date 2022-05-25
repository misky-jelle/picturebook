package dev.misky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class icecreamActivity : AppCompatActivity() {
    lateinit var btnPREVIEW:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icecream)

        btnPREVIEW = findViewById(R.id.btnPREVIEW)
        btnPREVIEW.setOnClickListener {
            val intent = Intent(this, food2Activity::class.java)
            startActivity(intent)
    }
}
}