package com.example.lab55.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lab55.MainActivity
import com.example.lab55.TodoEventoApp
import com.example.lab55.ui.EventDetails.view.EventDetails
import com.example.lab55.ui.Recetas.view.RecipeDetail
import com.example.lab55.ui.Recetas.view.RecipesScreen
import com.example.lab55.ui.events.model.EventContent

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.MainActivity.route){
        composable(route = AppScreens.MainActivity.route){
            TodoEventoApp(navController)
        }
        composable(route = AppScreens.EventDetailsActivity.route + "/{mediaId}",
        arguments = listOf(navArgument(name = "mediaId"){
            type = NavType.StringType
        })){ backStackEntry ->
            val id = backStackEntry.arguments?.getString("mediaId")
            requireNotNull(id)
            EventDetails(navController, id, EventContent.events)
        }
        composable("recipesByCategory/{categoryName}") { backStackEntry ->
            val categoryName = backStackEntry.arguments?.getString("categoryName") ?: ""
            RecipesScreen(categoryName, navController)
        }
        composable("itemDetailLookup/{recipeId}") { backStackEntry ->
            val recipeId = backStackEntry.arguments?.getString("recipeId") ?: ""
            RecipeDetail(recipeId, navController)
        }
    }
}