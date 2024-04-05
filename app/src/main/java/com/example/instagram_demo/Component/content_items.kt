package com.example.instagram_demo.Component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagram_demo.R
import com.google.android.gms.tagmanager.Container

@Composable
@Preview
fun ContentItems(){
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item{
            Post()
            Post()
            Post()
            Post()
        }
    }
}

@Composable
fun Post(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.LightGray)
            .padding(top = 2.dp)

    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 15.dp,)
                ) {
                    Image(painter = painterResource(id = R.drawable.logo),
                        contentDescription = null,
                        modifier = Modifier
                            .clip(CircleShape)
                            .border(
                                BorderStroke(
                                    1.dp,
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
                Text(text = "Name",
                    modifier = Modifier.padding(start = 10.dp))
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterEnd
                ){
                    IconButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Icon(imageVector = Icons.Filled.MoreVert, contentDescription = null)
                    }
                }
            }
            Image(painter = painterResource(id = R.drawable.pngtree_mountains_moon_nature_landscape_cartoon_background_decoration_pattern_picture_image_2385439),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth())
            Row() {
                IconButton(onClick = { /*TODO*/},
                    ) {
                    Icon(imageVector = Icons.Filled.FavoriteBorder,
                        contentDescription = null,)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Star,
                        contentDescription = null,)
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Send,
                        contentDescription = null,)
                }
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterEnd
                ){
                    IconButton(
                        onClick = { /*TODO*/ },
                    ) {
                        Icon(imageVector = Icons.Filled.Share, contentDescription = null)
                    }
                }
            }
            Text(text = "6.789 views")
            Text(text = "Content of the post")
        }
    }
}
