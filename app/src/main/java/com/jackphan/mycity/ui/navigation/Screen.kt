package com.jackphan.mycity.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Category : Screen("category")
    object Detail : Screen("detail/{placeId}")
    object Search : Screen("search")
    object Favorites : Screen("favorites")
}
