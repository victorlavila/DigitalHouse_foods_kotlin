package br.com.digitalhouse_foods

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class ActivityHome : AppCompatActivity() {

    private val editName by lazy { findViewById<TextInputEditText>(R.id.editName_home) }
    private val editPassword by lazy { findViewById<TextInputEditText>(R.id.editPassoword_home) }
    private val buttonHome by lazy { findViewById<Button>(R.id.button_home) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initView()
    }
    private fun initView() {
        val name = editName
        val password = editPassword
        buttonHome.setOnClickListener {
            val intent = Intent(this, ActivityRestaurants::class.java)
            intent.putExtra("chaveName", name.text.toString())
            startActivity(intent)
        }
    }
}