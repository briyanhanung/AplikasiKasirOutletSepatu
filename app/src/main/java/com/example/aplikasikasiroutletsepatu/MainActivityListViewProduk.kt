package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivityListViewProduk : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list_view_produk)

        val mStartActTextView = findViewById<TextView>(R.id.tvAdd)
        mStartActTextView.setOnClickListener {
            startActivity(Intent(this, InsertProduct::class.java))
        }
        val tvBack = findViewById<TextView>(R.id.tvBackProduct)
        tvBack.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
    }
}
