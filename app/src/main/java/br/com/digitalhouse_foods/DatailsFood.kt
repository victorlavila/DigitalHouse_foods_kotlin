package br.com.digitalhouse_foods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DatailsFood : AppCompatActivity() {
    private val datailImage by lazy { findViewById<ImageView>(R.id.image_detailsFood) }
    private val datailName by lazy { findViewById<TextView>(R.id.name_detailFood) }
    private val datailDescription by lazy { findViewById<TextView>(R.id.description_detailsFood) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datails_food)

    }

}