package com.example.myapplication.jetpackCompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun StateBhaiExample() {

    //remember keeps this value during recomposition
    //mutableStateOf holds a value that can be changed
    //& triggered recomposition when its value changes
    var score by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Score: $score", fontSize = 30.sp
            ,fontWeight= FontWeight.Bold
        )

        Row(){
            Button(onClick = {
                score++
            }, modifier = Modifier.weight(1f)) {
                Text(text = "increase")
            }

            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = {
                score--
            },
                modifier = Modifier.weight(1f),
                enabled = score > 0) {
                Text(text = "decrease")

            }
        }
    }
}

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RememberSaveableExample(){

    //rememberSaveable saves the state during configuration
    // changes such as theme and orientation
    var score by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Score: $score", fontSize = 30.sp
            ,fontWeight= FontWeight.Bold
        )

        Row(){
            Button(onClick = {
                score++
            }, modifier = Modifier.weight(1f)) {
                Text(text = "increase")
            }
            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = {
                score--
            },
                modifier = Modifier.weight(1f),
                enabled = score > 0) {
                Text(text = "decrease")
            }
        }
    }
}


@Composable
fun StateHoistingParent(){
    var score by rememberSaveable() { mutableStateOf(0) }

    CounterChild(
        score = score,
        increament ={
            score++
        },
        decreament={
            score--
        }
    )
}


@Composable
fun CounterChild(score: Int,
                 increament: () -> Unit,
                 decreament: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Score: $score", fontSize = 30.sp
            ,fontWeight= FontWeight.Bold
        )

        Row(){
            Button(onClick = {
                increament()
            }, modifier = Modifier.weight(1f)) {
                Text(text = "increase")
            }
            Spacer(modifier = Modifier.width(8.dp))

            Button(onClick = {
                decreament()
            },
                modifier = Modifier.weight(1f),
                enabled = score > 0) {
                Text(text = "decrease")
            }
        }
    }
}