package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_payment.*

class CheckOut : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)

        val mStartActTextView = findViewById<TextView>(R.id.tvBackCheckout)
        mStartActTextView.setOnClickListener {
            startActivity(Intent(this, Payment::class.java))
        }
        val tvCheck = findViewById<TextView>(R.id.tvCheck)
        tvCheck.setOnClickListener {
            startActivity(Intent(this, ThankYou::class.java))
        }
    }
}
