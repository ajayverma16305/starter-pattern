package com.example.starterpattern

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailActivity : AppCompatActivity() {

    companion object {
        const val KEY_NAME = "key_name"
        const val KEY_PROFILE_URL = "key_profile_url"
        const val KEY_WEB_URL = "key_web_url"

        fun initiateDetailActivityWith(context: Context, name: String, profileUrl: String, webUrl: String) {
            Intent(context, DetailActivity::class.java).apply {
                putExtra(KEY_NAME, name)
                putExtra(KEY_PROFILE_URL, profileUrl)
                putExtra(KEY_WEB_URL, webUrl)
                context.startActivity(this)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        this.readBundleValues()
    }

    private fun readBundleValues() {
        val name = intent.getStringExtra(KEY_NAME)
        val profileUrl = intent.getStringExtra(KEY_PROFILE_URL)
        val webUrl = intent.getStringExtra(KEY_WEB_URL)

        // Do magic work
    }
}
