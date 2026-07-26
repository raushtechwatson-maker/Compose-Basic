package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myapplication.jetpackCompose.c1_navigation.LoginScreenUI
import com.example.myapplication.jetpackCompose.c1_navigation.NavGraph

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            // MyApp2()
           // TextFieldExample()
            //MyApp2()

           // ColumnExample2()

           // BoxExample()

            //ModifierBhaiya()

           // ButtonExample()

            //LoginScreen()

            //CardExample2()

           // StateBhaiExample()

            //RememberSaveableExample()

           // StateHoistingParent()

            //AlertDialogExample()

            //LoginScreenUI(navController)

            NavGraph()
            }
        }
    }


