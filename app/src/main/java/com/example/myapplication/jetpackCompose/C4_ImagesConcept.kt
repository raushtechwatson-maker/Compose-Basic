package com.example.myapplication.jetpackCompose


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun ImageExample(){

    Image(painter = painterResource(R.drawable.grass_image),
        contentDescription = "imageOfGreenGrass",
        modifier = Modifier.padding(8.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .fillMaxWidth(),
        contentScale = ContentScale.Crop)
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun IconExample(){


   Column(modifier = Modifier.fillMaxSize(),
       horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center
       ){
       Icon(imageVector = Icons.Default.Person,
           contentDescription = "person",
           modifier = Modifier.size(100.dp),
           tint=Color.Red
       )

   }


}
