package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HistoryPayment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history_payment)

        val mStartActTextView = findViewById<TextView>(R.id.arrowback)
        mStartActTextView.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
