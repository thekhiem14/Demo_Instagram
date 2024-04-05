package com.example.instagram_demo.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagram_demo.Component.StoryBar
import com.example.instagram_demo.Component.ContentItems
import com.example.instagram_demo.Component.Directional
import com.example.instagram_demo.Component.Notification


@Composable
@Preview
fun MainScreen(){
    Scaffold(
        topBar = {
            Notification()
        },
        bottomBar = {
            Directional()
        },
    ){
        padding -> Column(
            modifier = Modifier.padding(padding)
        ){
            StoryBar()
            ContentItems()
        }
    }
}

