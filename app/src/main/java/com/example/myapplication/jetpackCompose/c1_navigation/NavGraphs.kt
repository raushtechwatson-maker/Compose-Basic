package com.example.myapplication.jetpackCompose.c1_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph() {
    //navController -->Handle navigation.
    //rememberNavController --->create and Remember navController
    val navController = rememberNavController()


    NavHost(
        navController = navController,
        startDestination = MyNavRoutes.LoginScreen1
    ) {

        composable<MyNavRoutes.LoginScreen1> {
            LoginScreenUI(navController)
        }

        composable<MyNavRoutes.HomeScreen> {
            HomeScreenUI(navController)
        }
    }
}