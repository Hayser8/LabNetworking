package com.example.lab55.ui.Meals.repository

import com.example.lab55.Networking.MealsWebService
import com.example.lab55.Networking.Response.MealInstructionResponse
import com.example.lab55.Networking.Response.MealRecipeResponse
import com.example.lab55.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MealsRepository(private val webService: MealsWebService = MealsWebService()) {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        return webService.getMeals().enqueue(object : Callback<MealsCategoriesResponse> {
            override fun onResponse(
                call: Call<MealsCategoriesResponse>,
                response: Response<MealsCategoriesResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealsCategoriesResponse>, t: Throwable) {
                // TODO treat failure
            }
        })
    }
    fun getRecipes(category: String, successCallback: (response: MealRecipeResponse?) -> Unit) {
        return webService.getRecipes(category).enqueue(object : Callback<MealRecipeResponse>  {
            override fun onResponse(
                call: Call<MealRecipeResponse>,
                response: Response<MealRecipeResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealRecipeResponse>, t: Throwable) {
                // TODO treat failure
            }
        })
    }
    fun getInstructions(recipeId: String, successCallback: (response: MealInstructionResponse?) -> Unit) {
        return webService.getMealInstructions(recipeId).enqueue(object : Callback<MealInstructionResponse> {
            override fun onResponse(
                call: Call<MealInstructionResponse>,
                response: Response<MealInstructionResponse>
            ) {
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<MealInstructionResponse>, t: Throwable) {
                // TODO treat failure
            }
        })
    }
}