package com.example.FaizanAndroidApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.FaizanAndroidApp.jetpackCompose.C12_scaffold.MyScaffoldScreen

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

           // NavGraph()

           // LazyColumnExample()
           // LazyRowExample()

            MyScaffoldScreen()
            }
        }
    }


