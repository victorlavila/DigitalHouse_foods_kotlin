package br.com.digitalhouse_foods

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.Adapters.FoodsAdapter
import br.com.digitalhouse_foods.Model.FoodsModel
import br.com.digitalhouse_foods.Model.RestaurantsModel

class ActivityFoods() : AppCompatActivity(), FoodsAdapter.OnFoodClickListener {

    private lateinit var restaurant : RestaurantsModel
    private var foodsList = getFoodsList()
    private val foodAdapter by lazy { FoodsAdapter(foodsList, this) }

    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_foods) }
    private val imageFood by lazy { findViewById<ImageView>(R.id.imagefood_activity) }
    private val nameRestaurantFood by lazy { findViewById<TextView>(R.id.nameRestaurant_food) }
    private val menuFood by lazy { findViewById<TextView>(R.id.menu_foods) }
    private val backForRestaurant by lazy { findViewById<ImageView>(R.id.back_food) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foods)

        val informations = intent.extras
        restaurant = informations?.getSerializable(RESTAURANT) as RestaurantsModel
        nameRestaurantFood.text = restaurant.nameRestaurant
        menuFood.text = restaurant.addressRestaurant

        restaurant.photoRestaurant.let { img ->
            imageFood.setImageResource(img)
        }

        backForRestaurant.setOnClickListener {
            onBackPressed()
        }


        recycler.adapter = foodAdapter

    }

    override fun onFoodClickListener(position: Int) {
        onBackPressed()
    }

    private fun getFoodsList(): ArrayList<FoodsModel>{
        val pratoUm = FoodsModel(
            R.drawable.prato_1,
            "Salada de algas"
        )

        val pratoDois = FoodsModel(
            R.drawable.prato_2,
            "Delicia de sampa"
        )

        val pratoTres = FoodsModel(
            R.drawable.prato_3,
            "Combo maravilha"
        )

        val pratoQuatro = FoodsModel(
            R.drawable.prato_4,
            "O melhor do méxico"
        )
        return arrayListOf(pratoUm, pratoDois, pratoTres, pratoQuatro, pratoUm, pratoDois, pratoTres, pratoQuatro)
    }

}