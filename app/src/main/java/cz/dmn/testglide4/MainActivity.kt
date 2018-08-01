package cz.dmn.testglide4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import cz.dmn.testlibrary.TestActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.test).setOnClickListener {
            startActivity(Intent(this, TestActivity::class.java))
        }
    }
}
