package com.example.starterpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Values to be replace with original values
        val name  = "Ajay"
        val profileUrl = "https://profilelinkabc"
        val webUrl = "www.google.com"

        clickMeButton.setOnClickListener {
            DetailActivity.initiateDetailActivityWith(
                context = this,
                name = name,
                profileUrl = profileUrl,
                webUrl = webUrl
            )
        }
    }
}
