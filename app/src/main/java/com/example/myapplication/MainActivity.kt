package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.jetpackCompose.BoxExample
import com.example.myapplication.jetpackCompose.ButtonExample
import com.example.myapplication.jetpackCompose.CardExample2
import com.example.myapplication.jetpackCompose.ColumnExample2
import com.example.myapplication.jetpackCompose.LoginScreen
import com.example.myapplication.jetpackCompose.ModifierBhaiya
import com.example.myapplication.jetpackCompose.MyApp2
import com.example.myapplication.jetpackCompose.OutLinedTextFieldExample
import com.example.myapplication.jetpackCompose.RememberSaveableExample
import com.example.myapplication.jetpackCompose.StateBhaiExample
import com.example.myapplication.jetpackCompose.StateHoistingParent
import com.example.myapplication.jetpackCompose.TextFieldExample
import com.example.myapplication.ui.theme.MyApplicationTheme

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

            StateHoistingParent()
            }
        }
    }


