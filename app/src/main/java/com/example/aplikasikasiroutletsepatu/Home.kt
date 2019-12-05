package com.example.aplikasikasiroutletsepatu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val mStartActImageViewProduct = findViewById<ImageView>(R.id.ImageViewproduk)
        mStartActImageViewProduct.setOnClickListener {
            startActivity(Intent(this, MainActivityListViewProduk::class.java))
        }
        val mStartActImageViewPayment = findViewById<ImageView>(R.id.ImageViewpayment)
        mStartActImageViewPayment.setOnClickListener {
            startActivity(Intent(this, Payment::class.java))
        }
        val mStartActImageViewHistoryPayment = findViewById<ImageView>(R.id.ImageViewHistoryofpayment)
        mStartActImageViewHistoryPayment.setOnClickListener {
            startActivity(Intent(this, HistoryPayment::class.java))
        }
        val mStartActImageViewProfit = findViewById<ImageView>(R.id.ImageViewProfit)
        mStartActImageViewProfit.setOnClickListener {
            startActivity(Intent(this, Profit::class.java))
        }
    }
}
