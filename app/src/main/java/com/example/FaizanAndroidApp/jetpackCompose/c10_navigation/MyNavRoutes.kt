package com.example.FaizanAndroidApp.jetpackCompose.c10_navigation

import kotlinx.serialization.Serializable


//sealed class creates a restricted hierarchy
// sealed classes are abstract ,so its subclasses can only be defined in the same file
//Each subclass of sealed class can have its own data and behavior

@Serializable
sealed class MyNavRoutes {

   @Serializable
   object LoginScreen1 : MyNavRoutes()

   @Serializable
   object HomeScreen : MyNavRoutes()

   @Serializable
   data class WelcomeScreen(val userName: String) : MyNavRoutes()



}