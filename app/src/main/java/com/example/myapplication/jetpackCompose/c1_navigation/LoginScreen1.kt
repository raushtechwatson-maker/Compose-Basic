package com.example.myapplication.jetpackCompose.c1_navigation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreenUI(navController: NavHostController) {
    val context = LocalContext.current

    var username by remember { mutableStateOf(" ") }
    var userPassword by remember { mutableStateOf(" ") }


    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(text = "Login Here", fontSize = 30.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.width(32.dp))

        OutlinedTextField(
            value = username, onValueChange = {
            username = it
        }, label = { Text("UserName") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(
            value = userPassword, onValueChange = {
            userPassword = it
        }, label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                navController.navigate(MyNavRoutes.HomeScreen)
            }, modifier = Modifier.fillMaxWidth().height(48.dp),
            shape = RoundedCornerShape(11.dp),
            border = BorderStroke(2.dp, color = Color.Yellow),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            enabled = username.isNotEmpty() && userPassword.isNotEmpty()
        ) {
            Text(text = "LOGIN", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
        }

    }

}