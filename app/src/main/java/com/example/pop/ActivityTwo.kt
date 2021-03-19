package com.example.pop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityTwo : AppCompatActivity() {

    lateinit var leftpanelbutton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitytwo)

        leftpanelbutton2 = findViewById(R.id.leftpanelbutton2)

        leftpanelbutton2.setOnClickListener {
            val intent = Intent(this, ActivityTre::class.java)
            startActivity(intent)
        }
    }
}