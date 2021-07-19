package com.example.test

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnAbout)

        btn.setOnClickListener {
            //val intent = Intent(this, AboutActivity::class.java)

            //val geo = Uri.parse("geo: 3.1390, 101.6869")
            //val intent = Intent(Intent.ACTION_VIEW, geo)


            //val telNo = Uri.parse("tel:012348865")
            //val intent = Intent(Intent.ACTION_DIAL, telNo)

            val intent = Intent(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, "Hello")




            startActivity(intent)
        }
    }

}