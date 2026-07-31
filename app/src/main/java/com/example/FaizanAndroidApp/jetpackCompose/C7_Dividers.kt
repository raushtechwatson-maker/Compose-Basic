package com.example.FaizanAndroidApp.jetpackCompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HorizontalDividerExample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Profile Details", fontSize = 20.sp)
        HorizontalDivider(modifier = Modifier.width(250.dp).padding(16.dp),
            1.dp, color = Color.Red)
        Text(text = "More Information", fontSize = 20.sp)
    }
}






@Preview(showBackground = true, showSystemUi = true)
@Composable
fun VerticalDividerExample() {

    Row(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Text(text = "Profile Details", fontSize = 20.sp)
        VerticalDivider(modifier =
            Modifier.width(50.dp)
            .padding(16.dp),
            2.dp,
            color = Color.Red)
        Text(text = "More Information", fontSize = 20.sp)
    }
}