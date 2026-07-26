package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun StateExample(){
    var count by remember{
        mutableStateOf(0)
    }


    Column(modifier = Modifier.fillMaxSize()
        .padding(20.dp)
        .height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally){

        Text("$count")

        Spacer(modifier = Modifier.height(25.dp))

        Button(onClick = {
            count++
        }){
            Text("Increase")
        }
    }
}

@Composable
fun MyApp(){
    Surface(modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()   // 👈 ye add karo status bar ke niche se ui show karne ke liye
        ) {
            StateExample()
        }
    }
}