package com.example.FaizanAndroidApp.jetpackCompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun RowExample(){
    Row(modifier = Modifier.fillMaxSize(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically){
        Text("Apple", fontSize = 26.sp)
        Text("Banana", fontSize = 26.sp)
        Text("JackFruit", fontSize = 26.sp)

    }
}


@Composable
fun ColumnExample(){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ){
        Text(text = "Book 01",
            fontSize = 26.sp,
            modifier = Modifier.align(Alignment.BottomEnd as Alignment.Horizontal))

        Text("Book 02", fontSize = 26.sp)

        Text("Book 03", fontSize = 26.sp)

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ColumnExample2(){

    Column(modifier = Modifier.fillMaxSize()
        .padding(7.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Login Here", fontSize = 26.sp)

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text("Enter your email")}
        )



        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {Text("Enter your password")}
        )

        Button(onClick = {
        }){
            Text("Login")
        }

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BoxExample(){


    Box(modifier = Modifier.fillMaxSize()
    , contentAlignment = Alignment.Center){

        Text("Note 01",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.BottomEnd))

        Text("Note 02",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.TopEnd))

        Text("Note 03",
            fontSize = 30.sp,
            modifier = Modifier.align(Alignment.CenterStart))
    }
}


