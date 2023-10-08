package com.example.lab55.ui.Recetas.view

import androidx.lifecycle.ViewModel
import com.example.lab55.Networking.Response.MealInstructionResponse
import com.example.lab55.Networking.Response.MealRecipeResponse
import com.example.lab55.ui.Meals.repository.MealsRepository


class RecipesViewModel(private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getRecipes(category: String, successCallback: (response: MealRecipeResponse?) -> Unit) {
        repository.getRecipes(category) { response ->
            successCallback(response)
        }
    }
    fun getInstructions(recipeId: String, successCallback: (response: MealInstructionResponse?) -> Unit) {
        repository.getInstructions(recipeId) { response ->
            successCallback(response)
        }
    }

}
