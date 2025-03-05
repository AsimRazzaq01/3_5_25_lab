package com.example.a3_5_25_lab

import android.telecom.Call.Details
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun DetailsScreen(navController: NavHostController,name: String, modifier: Modifier = Modifier){

    LazyColumn(modifier) {
        item {
            Text(text = "Details Screen", fontSize = 40.sp)
        }
        item{
            Text(text = "Name = $name" )
        }
        item{
            Button(onClick={
                navController.popBackStack()
            })
            {
                Text("Go back to main screen")
            }
        }



    }   // End of Lazy column

}