@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.instagram_demo.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instagram_demo.R
@Composable
fun Notification(){
    TopAppBar(
        title = {
            Image(
                painter = painterResource(R.drawable.instagram_logo),
                contentDescription = null,
                modifier = Modifier
                .size(size = 145.dp)
            )
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.FavoriteBorder,
                    contentDescription = null)
            }
        }
    )
}