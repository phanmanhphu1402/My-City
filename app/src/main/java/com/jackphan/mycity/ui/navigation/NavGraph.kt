package com.jackphan.mycity.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jackphan.mycity.ui.screen.CategoryScreen
import com.jackphan.mycity.ui.screen.HomeScreen

@Composable
fun MyCityNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
        composable(Screen.Category.route) {
            CategoryScreen(navController)
        }
    }
}