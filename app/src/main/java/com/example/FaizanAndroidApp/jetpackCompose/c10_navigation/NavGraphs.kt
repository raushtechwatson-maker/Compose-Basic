package com.example.FaizanAndroidApp.jetpackCompose.c10_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute

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


        //backStackEntry is a lambda function
        // having data and arguements which are passed during navigation.
        composable<MyNavRoutes.WelcomeScreen> { backStackEntry ->
            val data = backStackEntry.toRoute<MyNavRoutes.WelcomeScreen>()
            WelcomeScreenUI(data.userName, navController)
        }
    }
}