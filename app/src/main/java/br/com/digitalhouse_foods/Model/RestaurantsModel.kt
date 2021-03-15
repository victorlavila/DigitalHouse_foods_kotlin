package br.com.digitalhouse_foods.Model

import java.io.Serializable

data class RestaurantsModel (
    val photoRestaurant: Int,
    val nameRestaurant: String,
    val addressRestaurant: String
): Serializable