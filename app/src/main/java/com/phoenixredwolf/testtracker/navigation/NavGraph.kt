package com.phoenixredwolf.testtracker.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.phoenixredwolf.testtracker.ui.viewmodel.MainViewModel

@Composable
fun SetupNavGraph(startDestination: String, navController: NavHostController) {
    NavHost(
        startDestination = startDestination,
        navController = navController
    ) {
        listRoute(
            navigateToDetail = {

            }
        )
    }
}

fun NavGraphBuilder.listRoute(
    navigateToDetail: () -> Unit
) {
    composable(route = Screen.List.route) {
        val viewmodel: MainViewModel = hiltViewModel()
        val characters by viewmodel.characters.value
        val alertDialogOpened = remember { androidx.compose.runtime.mutableStateOf(false) }

    }
}

fun NavGraphBuilder.detailRoute() {
    composable(route = Screen.Detail.route) {

    }
}