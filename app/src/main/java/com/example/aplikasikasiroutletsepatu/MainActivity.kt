package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mStartActTextView = findViewById<TextView>(R.id.tvDonthaveaccount)
        mStartActTextView.setOnClickListener {
            startActivity(Intent(this@MainActivity, SignUp::class.java))
        }
        btn_Signin.setOnClickListener {
            intent = Intent (this, Home::class.java)
            startActivity(intent)
        }
    }
}
