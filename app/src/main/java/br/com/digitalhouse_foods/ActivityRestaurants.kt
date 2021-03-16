package br.com.digitalhouse_foods

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.Adapters.RestaurantAdapter
import br.com.digitalhouse_foods.Model.RestaurantsModel

const val RESTAURANT = "restaurant"

class ActivityRestaurants : AppCompatActivity(), RestaurantAdapter.OnRestauranteClickListener {

    private val restaurantList = getRestaurantList()
    private val restaurantAdapter by lazy { RestaurantAdapter(restaurantList, this)}
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_Restaurants) }
    private val userName by lazy { findViewById<TextView>(R.id.receiveName) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurants)
        recycler.adapter = restaurantAdapter

        val intent = intent.extras
        userName.text = intent?.getString("chaveName")

    }
        fun getRestaurantList(): List<RestaurantsModel>{

            val restauranteUm = RestaurantsModel(
                R.drawable.prato_1,
                "Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo \nFecha às 22:00"
            )
            val restauranteDois = RestaurantsModel(
                R.drawable.prato_2,
                "Aoyama - Moema",
                "Alameda dos Arapanés, 532 - Moema \nFecha às 00:00"
            )
            val restauranteTres = RestaurantsModel(
                R.drawable.prato_3,
                "Outback - Moema",
                "Av. Moaci, 187, 187 - Moema, São Paulo \nFecha às 00:00"
            )
            val restauranteQuatro = RestaurantsModel(
                R.drawable.prato_4,
                "Sí Señor!",
                "Alameda Jauaperi, 626 - Moema \nFecha às 01:00"
            )
            return listOf(restauranteUm, restauranteDois, restauranteTres, restauranteQuatro)
        }

    override fun onRestauranteClick(position: Int) {
        Intent(this, ActivityFoods::class.java).apply {
            putExtra(RESTAURANT, restaurantList[position])
            startActivity(this)
        }
    }
}