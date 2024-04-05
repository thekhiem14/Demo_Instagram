package com.example.instagram_demo.Component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagram_demo.R
import com.example.instagram_demo.Component.Story

@Composable
@Preview
fun StoryBar(){
    LazyRow(
        modifier = Modifier
            .padding(top = 0.dp)
            .background(color = Color.White)
    ) {
        item{
            Story()
            Story()
            Story()
            Story()
            Story()
            Story()
        }

    }
}
@Composable
fun Story(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(100.dp)
                .padding(start = 15.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.images),
                contentDescription = null,
                modifier = Modifier
                    .clip(CircleShape)
                    .border(
                        BorderStroke(
                            4.dp,
                            Brush.sweepGradient(
                                listOf(
                                    Color(0xFF9575CD),
                                    Color(0xFFBA68C8),
                                    Color(0xFFE57373),
                                    Color(0xFFFFB74D),
                                    Color(0xFF9575CD),
                                )
                            )
                        ),
                        CircleShape
                    )
            )
        }
        Text(text = "Name")
    }
}
