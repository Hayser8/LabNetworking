package com.example.lab55.Networking.Response

import com.google.firebase.firestore.PropertyName
import com.google.gson.annotations.SerializedName

data class MealsCategoriesResponse(val categories: List<MealResponse>)

data class MealRecipeResponse(val meals: List<MealRecipe>)

data class MealInstructionResponse(val meals: List<MealInstruction>)

data class MealResponse(
    @PropertyName("id") var id: String = "",
    @PropertyName("name") var name: String = "",
    @PropertyName("description") var description: String = "",
    @PropertyName("imageUrl") var imageUrl: String = ""
)


data class MealRecipe(
    @PropertyName("id") val id: String = "",
    @PropertyName("name") val name: String = "",
    @PropertyName("imageUrl") val imageUrl: String = "",
    @PropertyName("category") val category: String = ""
)

data class MealInstruction(
    @PropertyName("id") val id: String = "",
    @PropertyName("name") val name: String = "",
    @PropertyName("instructions") val instructions: String = "",
    @PropertyName("imageUrl") val imageUrl: String = ""
)


