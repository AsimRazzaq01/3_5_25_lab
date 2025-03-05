package com.example.a3_5_25_lab

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun MainScreen(navController: NavController, modifier: Modifier =Modifier) {
    var nameList = mutableListOf("Mateo", "Ali", "Zara", "Naomi")
    var context = LocalContext.current
    LazyColumn(modifier.clickable { navController.navigate("DetailsScreen") }) {
        item {
            Text(text = "Main Screen" , fontSize = 30.sp)
        }
        items(nameList) { currentItem ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clickable {
                        // Click event handler code goes here...
                        navController.navigate("DetailsScreen")
                        Toast.makeText(context, currentItem, Toast.LENGTH_SHORT).show()

                    }
            ) {
                Column {
                    Text(text = currentItem.toString())
                }
            }

        }
    }
}