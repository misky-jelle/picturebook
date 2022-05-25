package dev.misky.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class food2Activity : AppCompatActivity() {
    lateinit var btnNEXT2: Button
    lateinit var btnPREview:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food2)
        btnNEXT2=findViewById(R.id.btnNEXT2)
        btnNEXT2.setOnClickListener{
            val intent = Intent (this,icecreamActivity ::class.java)
            startActivity(intent)
    }
        btnPREview = findViewById(R.id.btnPREview)
        btnPREview.setOnClickListener {
            val intent = Intent(this, foodActivity::class.java)
            startActivity(intent)
}
}
}