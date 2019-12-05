package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import android.widget.TextView

class Profit : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profit)

        val mStartActTextView = findViewById<TextView>(R.id.tvBackProfit)
        mStartActTextView.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

    }


}
