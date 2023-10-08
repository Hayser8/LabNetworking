package com.example.lab55.ui.Comidas.view

import androidx.lifecycle.ViewModel
import com.example.lab55.Networking.Response.MealsCategoriesResponse
import com.example.lab55.ui.Meals.repository.MealsRepository


class MealsCategoriesViewModel (private val repository: MealsRepository = MealsRepository()): ViewModel() {
    fun getMeals(successCallback: (response: MealsCategoriesResponse?) -> Unit) {
        repository.getMeals { response ->
            successCallback(response)
        }
    }
}