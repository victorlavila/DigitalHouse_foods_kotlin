package br.com.digitalhouse_foods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhouse_foods.Adapters.FoodsAdapter
import br.com.digitalhouse_foods.Model.FoodsModel
import java.util.ArrayList

class ActivityFoods : AppCompatActivity() {
    private val imageFood by lazy { findViewById<ImageView>(R.id.imagefood_activity) }
    private val titleRestaurant by lazy { findViewById<TextView>(R.id.nameRestaurant_food) }
    private val menuFood by lazy { findViewById<TextView>(R.id.menu_foods) }
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_foods) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_restaurants)

        val steackList = getFoods()

        val adapter = FoodsAdapter(steackList, this)
        recycler.adapter = adapter

    }

    private fun getFoods(): ArrayList<FoodsModel> {
        val steack = ArrayList<FoodsModel>()

        steack.add(FoodsModel(R.drawable.prato_1,
            "Salada de algas com gengibre"))

        steack.add(FoodsModel(R.drawable.prato_2,
            "Camarão gratinado e ervas."))

        steack.add(FoodsModel(R.drawable.prato_3,
            "Um delicioso combo para você!"))

        steack.add(FoodsModel(R.drawable.prato_4,
            "O melhor Mexinado de São Paulo!"))

        steack.add(FoodsModel(R.drawable.prato_1,
            "Salada de algas com gengibre"))

        steack.add(FoodsModel(R.drawable.prato_2,
            "Camarão gratinado e ervas."))

        steack.add(FoodsModel(R.drawable.prato_3,
            "Um delicioso combo para você!"))

        steack.add(FoodsModel(R.drawable.prato_4,
            "O melhor Mexinado de São Paulo!"))

        return steack
    }
}