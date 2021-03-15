package br.com.digitalhouse_foods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            val mIntent = Intent(this, ActivityHome::class.java)
            startActivity(mIntent)
            finish()
        }, 3000)
    }
}