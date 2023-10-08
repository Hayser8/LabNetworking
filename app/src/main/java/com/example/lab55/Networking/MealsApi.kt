package com.example.lab55.Networking
import com.example.lab55.Networking.Response.MealInstructionResponse
import com.example.lab55.Networking.Response.MealRecipeResponse
import com.example.lab55.Networking.Response.MealsCategoriesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealsApi {
    @GET("categories.php")
    fun getMeals(): Call<MealsCategoriesResponse>

    @GET("filter.php")
    fun getRecipes(@Query("c") category: String): Call<MealRecipeResponse>

    @GET("lookup.php")
    fun getMealInstructions(@Query("i") recipeId: String): Call<MealInstructionResponse>
}
