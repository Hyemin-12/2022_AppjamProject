package com.example.appjamproject

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class XResultActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.x_result_activity)

        findViewById<ImageView>(R.id.first_image).clipToOutline = true
        findViewById<ImageView>(R.id.second_image).clipToOutline = true
        findViewById<ImageView>(R.id.third_image).clipToOutline = true

        findViewById<Button>(R.id.all_result_btn).setOnClickListener {
            val intent = Intent(this, AllResultActivity::class.java)
            startActivity(intent)
        }
    }
}