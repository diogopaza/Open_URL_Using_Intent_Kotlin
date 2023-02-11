package com.example.openurl

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text_facebook = findViewById<TextView>(R.id.text_facebook)
        val button_instagram = findViewById<Button>(R.id.button_instagram)
        val image_linkedin = findViewById<ImageView>(R.id.image_linkedin)

        button_instagram.setOnClickListener(){
            goToUrl("https://www.instagram.com/");
        }
        text_facebook.setOnClickListener(){
            goToUrl("https://pt-br.facebook.com/");
        }
        image_linkedin.setOnClickListener(){
            goToUrl("https://br.linkedin.com/");
        }
    }
    private fun goToUrl(url: String) {
        val i =  Intent(Intent.ACTION_VIEW,  Uri.parse(url))
        startActivity(i)
    }
}