package br.com.digitalhouse_foods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.Adapters.RestaurantAdapter
import br.com.digitalhouse_foods.Model.RestaurantsModel
import java.util.ArrayList

class ActivityRestaurants : AppCompatActivity() {
    private val receiveName by lazy { findViewById<TextView>(R.id.receiveName) }
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_Restaurants) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)

        val extras = intent.extras
        receiveName.text = extras?.getString("chaveName")

        val menuRestaurants = getRestaurant()

        val adapter = RestaurantAdapter(menuRestaurants, this)
        recycler.adapter = adapter

    }



    private fun getRestaurant(): ArrayList<RestaurantsModel> {
        val arrayList = ArrayList<RestaurantsModel>()

        arrayList.add(RestaurantsModel(R.drawable.prato_1,
            "Aoyama Moema",
            "Av. Lavandisca, 717 - Indianópolis, São paulo \nFechas as 22hs"))

        arrayList.add(RestaurantsModel(R.drawable.prato_2,
            "Tony Roma's",
            "Al. dos Arapanes, 532 - Moema, São paulo \nFechas as 00hs"))

        arrayList.add(RestaurantsModel(R.drawable.prato_3,
            "Outback Moema",
            "Av. Moaci, 157 - Moema, São paulo \nFechas as 00hs"))

        arrayList.add(RestaurantsModel(R.drawable.prato_4,
            "Sí Señor",
            "Al. do jauaperi, 626 - Moema, São paulo \nFechas as 01hs"))
        return arrayList


    }
}