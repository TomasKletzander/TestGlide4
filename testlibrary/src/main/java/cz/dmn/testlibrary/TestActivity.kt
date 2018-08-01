package cz.dmn.testlibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import cz.dmn.glidelibrary.GlideApp

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val image = findViewById<ImageView>(R.id.image)
        GlideApp.with(this)
                .load("https://images.iflixassets-staging.com/offertron/test/minions.webp")
                //.load("https://iflix-images-staging.akamaized.net/offertron/subscription/subscription-expired-30.png?transform=true&webp=true")
                .into(image)
    }
}