package com.phoenixredwolf.testtracker.navigation

sealed class Screen(val route: String) {
    object List: Screen(route = "list_screen")
    object Detail: Screen(route = "detail_screen")
}