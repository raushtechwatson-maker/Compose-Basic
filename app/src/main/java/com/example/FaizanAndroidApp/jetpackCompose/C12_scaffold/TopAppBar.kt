package com.example.FaizanAndroidApp.jetpackCompose.C12_scaffold

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopAppBarScreen(){
    TopAppBar(
        title = { Text(text = "Mission Android 2026",
            fontWeight = FontWeight.SemiBold,
            fontSize = 18.sp
        ) },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }){
            Icon(
                imageVector =  Icons.Default.Menu,
                contentDescription = "Menu"
            )
        }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }){
                Icon(
                    imageVector =  Icons.Default.Search,
                    contentDescription = "Search"
                )
            }

            IconButton(onClick = { /*TODO*/ }){
                Icon(
                    imageVector =  Icons.Default.MoreVert,
                    contentDescription = "MoreVert"
                )
            }
        }
        , colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Blue,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White

        )
    )
}
