package com.example.a3_5_25_lab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a3_5_25_lab.ui.theme._3_5_25_labTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _3_5_25_labTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    //MainScreen(modifier = Modifier.padding(innerPadding))
                    Nav(Modifier.padding(innerPadding))

                }
            }
        }
    }

}