package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_insert_product.*

class InsertProduct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert_product)

        btn_insert.setOnClickListener {
            intent = Intent(this, MainActivityListViewProduk::class.java)
            startActivity(intent)
        }
        val tvBack = findViewById<TextView>(R.id.tvBackInputProduct)
        tvBack.setOnClickListener {
            startActivity(Intent(this, MainActivityListViewProduk::class.java))
        }
    }
}
