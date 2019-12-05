package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_payment.*

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        btn_Pay.setOnClickListener {
            intent = Intent(this, CheckOut::class.java)
            startActivity(intent)
        }
        val mStartActTextView = findViewById<TextView>(R.id.tvBackPayment)
        mStartActTextView.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
