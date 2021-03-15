package br.com.digitalhouse_foods.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.Model.FoodsModel
import br.com.digitalhouse_foods.R
import java.util.ArrayList

class FoodsAdapter (val foodsList:ArrayList<FoodsModel>, val context: Context)
    : RecyclerView.Adapter<FoodsAdapter.FoodsViewHolder>() {

    inner class FoodsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageFood = itemView.findViewById<ImageView>(R.id.imagefood_activity)
        val description = itemView.findViewById<TextView>(R.id.name_food)

        fun bindFoods(foods: FoodsModel){
            imageFood.setImageResource(foods.imageSnack)
            description.text = foods.information
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_foods, parent, false)
        return FoodsViewHolder(view)
    }

    override fun getItemCount() = foodsList.size

    override fun onBindViewHolder(holder: FoodsViewHolder, position: Int) {
        holder.bindFoods(foodsList[position])
    }
}