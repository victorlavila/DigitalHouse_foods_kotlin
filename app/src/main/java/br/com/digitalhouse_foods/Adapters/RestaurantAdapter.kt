package br.com.digitalhouse_foods.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.ActivityFoods
import br.com.digitalhouse_foods.ActivityRestaurants
import br.com.digitalhouse_foods.Model.RestaurantsModel
import br.com.digitalhouse_foods.R
import java.util.ArrayList

class RestaurantAdapter (val arrayList:ArrayList<RestaurantsModel>, val context:Context)
    : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    val activityRestaurant = ActivityRestaurants()

    inner class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageRestaurant = itemView.findViewById<ImageView>(R.id.image_restaurant)
        val nameRestaurant = itemView.findViewById<TextView>(R.id.name_restaurant)
        val addresRestaurant = itemView.findViewById<TextView>(R.id.address_restaurant)

        fun bindItems(restaurants: RestaurantsModel){
            nameRestaurant.text = restaurants.nameRestaurant
            addresRestaurant.text = restaurants.addressRestaurant
            imageRestaurant.setImageResource(restaurants.photoRestaurant)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_restaurants, parent,false)
        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = arrayList.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        holder.bindItems(arrayList[position])

        holder.imageRestaurant.setOnClickListener {  }
        val intent = Intent(context, ActivityFoods::class.java)
        if(position == 0){
            intent.putExtra("chaveImag1", R.drawable.prato_1)
        }
        if(position == 1){
            intent.putExtra("chaveImag2", R.drawable.prato_2)
        }
        if(position == 2){
            intent.putExtra("chaveImag3", R.drawable.prato_3)
        }
        if(position == 3){
            intent.putExtra("chaveImag4", R.drawable.prato_4)
        }
    }
}