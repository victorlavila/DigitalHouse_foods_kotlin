package br.com.digitalhouse_foods.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.Model.FoodsModel
import br.com.digitalhouse_foods.R

class FoodsAdapter(
    private val foodsList: List<FoodsModel>,
    private val onFoodsClickListener: OnFoodClickListener
)
    : RecyclerView.Adapter<FoodsAdapter.FoodsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item_foods, parent, false)
        return FoodsViewHolder(view)
    }

    override fun getItemCount() = foodsList.size

    override fun onBindViewHolder(holder: FoodsViewHolder, position: Int) {
        val currentItem = foodsList[position]
        holder.imageFood.setOnClickListener {
            onFoodsClickListener.onFoodClickListener(position)
        }

        holder.imageFood.setImageResource(currentItem.imageSnack)
        holder.description.text = currentItem.information

    }

    inner class FoodsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageFood = itemView.findViewById<ImageView>(R.id.image_food)
        val description = itemView.findViewById<TextView>(R.id.name_food)
    }

    interface OnFoodClickListener {
        fun onFoodClickListener(position: Int)
    }


}

