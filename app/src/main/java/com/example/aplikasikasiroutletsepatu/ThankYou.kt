package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThankYou : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thank_you)

        val mStartActTextView = findViewById<TextView>(R.id.tvChecklist)
        mStartActTextView.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
