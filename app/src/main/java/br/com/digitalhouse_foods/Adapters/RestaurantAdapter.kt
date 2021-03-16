package br.com.digitalhouse_foods.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.Model.RestaurantsModel
import br.com.digitalhouse_foods.R

class RestaurantAdapter(
    private val restaurantList: List<RestaurantsModel>,
    private val restauranteClickListener: OnRestauranteClickListener)
    : RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.activity_item_restaurants, parent,false)
        return RestaurantViewHolder(view)
    }

    override fun getItemCount() = restaurantList.size

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val currentItem = restaurantList[position]
        holder.imageRestaurant.setOnClickListener {
            restauranteClickListener.onRestauranteClick(position)
        }

        holder.nameRestaurant.text = currentItem.nameRestaurant
        holder.addresRestaurant.text = currentItem.addressRestaurant
        holder.imageRestaurant.setImageResource(currentItem.photoRestaurant)

    }

    inner class RestaurantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageRestaurant = itemView.findViewById<ImageView>(R.id.image_restaurant)
        val nameRestaurant = itemView.findViewById<TextView>(R.id.name_restaurant)
        val addresRestaurant = itemView.findViewById<TextView>(R.id.address_restaurant)

    }

    interface OnRestauranteClickListener {
        fun onRestauranteClick(position: Int)
    }
}