package com.example.myapplication.jetpackCompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedSecureTextField
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


@Composable
fun TextExample() {
    Text(
        text = "Mission Android 2026",
        color = Color.Blue,
        fontSize = 15.sp,
        fontWeight = FontWeight.Black,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 1.5.sp,
        textAlign = TextAlign.End
    )
}


//@Preview(showBackground = true, showSystemUi = true)
@Composable
 fun TextFieldExample() {
    var name by remember {
        mutableStateOf(" ")
    }

    TextField(
        value = name,
        onValueChange = {
            name = it
        },
        //label={Text("Enter your name")},
        placeholder = { "Enter your name" },
        leadingIcon = {
            Text(
                "*",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )
        }, trailingIcon ={  Text(
            "#",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )}, singleLine = true,
//        shape = RoundedCornerShape(12.dp)
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Blue,
            unfocusedContainerColor = Color.Yellow,
            focusedIndicatorColor = Color.Cyan,
            focusedContainerColor = Color.Green
        )
    )
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutLinedTextFieldExample(){

  var name by remember{
      mutableStateOf(" ")
  }

    OutlinedTextField(
        value = name,
        onValueChange = {
            name = it
        },
        //label = { Text("Enter your name")},
        placeholder = { Text("Enter your name")},
        singleLine = true
        , trailingIcon ={  Text(
            "#",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )},
//        shape = RoundedCornerShape(12.dp)
        shape = CircleShape,
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Cyan,
            focusedTextColor = Color.Blue,
            focusedBorderColor = Color.Red,
            unfocusedContainerColor = Color.Yellow,
            focusedContainerColor = Color.Green
        )
    )
}


@Composable
fun MyApp2() {

    MyApplicationTheme {
        // MyApp()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .systemBarsPadding()   // 👈 ye add karo status bar ke niche se ui show karne ke liye
        ) {
            OutLinedTextFieldExample()
        }
    }
}