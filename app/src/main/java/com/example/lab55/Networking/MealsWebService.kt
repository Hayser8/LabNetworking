package com.example.lab55.Networking

import com.example.lab55.Networking.Response.MealInstructionResponse
import com.example.lab55.Networking.Response.MealRecipeResponse
import com.example.lab55.Networking.Response.MealsCategoriesResponse
import retrofit2.Retrofit
import retrofit2.Call
import retrofit2.converter.gson.GsonConverterFactory

class MealsWebService {

    private lateinit var api: MealsApi

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(MealsApi::class.java)
    }

    fun getMeals(): Call<MealsCategoriesResponse> {
        return api.getMeals()
    }

    fun getRecipes(category: String): Call<MealRecipeResponse> {
        return api.getRecipes(category)
    }


    fun getMealInstructions(recipeId: String): Call<MealInstructionResponse> {
        return api.getMealInstructions(recipeId)
    }
}