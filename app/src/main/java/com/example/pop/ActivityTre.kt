package com.example.pop

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityTre : AppCompatActivity() {

    lateinit var centertpaneltext1 : TextView
    lateinit var centertpaneltext2: TextView
    lateinit var centertpaneltext3: TextView
    lateinit var centertpaneltext4: TextView
    lateinit var centertpaneltext5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitytre)

        centertpaneltext1 = findViewById(R.id.centertpaneltext1)

        centertpaneltext1.setOnClickListener {
            val intent = Intent(this, Activity22::class.java)
            startActivity(intent)
        }


        //2023 skizb
        centertpaneltext2 = findViewById(R.id.centertpaneltext2)

        centertpaneltext2.setOnClickListener {
            val intent = Intent(this, Activity23::class.java)
            startActivity(intent)
        }
        //2023 verj

        //2024 skizb
        centertpaneltext3 = findViewById(R.id.centertpaneltext3)

        centertpaneltext3.setOnClickListener {
            val intent = Intent(this, Activity24::class.java)
            startActivity(intent)
        }
        //2024 verj

        //2025
        centertpaneltext4 = findViewById(R.id.centertpaneltext4)

        centertpaneltext4.setOnClickListener {
            val intent = Intent(this, Activity25::class.java)
            startActivity(intent)
        }
        //2025

        //2026
        centertpaneltext5 = findViewById(R.id.centertpaneltext5)

        centertpaneltext5.setOnClickListener {
            val intent = Intent(this, Activity26::class.java)
            startActivity(intent)
        }
        //2026
    }

}