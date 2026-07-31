package com.example.FaizanAndroidApp.jetpackCompose

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowOutward
import androidx.compose.material.icons.filled.KeyboardDoubleArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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


@Composable
fun ButtonExample() {

    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = {
                Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
            }, modifier = Modifier.fillMaxWidth()
                .padding(8.dp)
                .size(50.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,
                contentColor = Color.Black
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 20.dp,
                disabledElevation = 0.dp
            ), border = BorderStroke(2.dp, Color.Black)
        )
        {

            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.KeyboardDoubleArrowRight,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Click Here")
            }
        }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreen() {

    val context = LocalContext.current
    var userName by remember { mutableStateOf(" ") }
    var userPassword by remember { mutableStateOf(" ") }

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Login Here", fontSize = 30.sp, fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))

        OutlinedTextField(
            value = userName, onValueChange = { userName = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Enter your email") },
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = userPassword, onValueChange = { userPassword = it },
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = "Enter your password") },
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
            }, modifier = Modifier.fillMaxWidth()
                .size(50.dp),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            ),
            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 20.dp,
                disabledElevation = 0.dp
            ), border = BorderStroke(2.dp, Color.Green),
            enabled = userName.isNotBlank() && userPassword.isNotBlank()
        )
        {
            Text(text = "Login", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        }
    }
}


//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutLinedButtonExample() {

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedButton(
            onClick = {
            }, modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            )
        ) {
            Text("Click Me!")
        }
    }
}


@Composable
fun TextButtonExample() {

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextButton(onClick = {

        }) {
            Text(text = "Forgot Password")
        }

        Text(
            text = "Forgot Password",
            modifier = Modifier.clickable(onClick = { })
        )


    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconButtonExample() {

    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        IconButton(onClick = {

        }) {
            Icon(
                imageVector = Icons.Default.ArrowOutward,
                contentDescription = null,
                modifier = Modifier.size(50.dp)
            )
        }
    }


}