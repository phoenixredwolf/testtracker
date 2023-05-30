package com.phoenixredwolf.testtracker.presentation.screens.listview

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListTopBar(
    scrollBehavior: TopAppBarScrollBehavior,
    onMenuClicked: () -> Unit,
    onMenuClosed: () -> Unit
) {
    TopAppBar(
        scrollBehavior = scrollBehavior,
        navigationIcon = {
//            IconButton(onClick = onMenuClicked) {
//                Icon(
//                    imageVector = Icons.Default.Menu,
//                    contentDescription = "Hamburger menu icon"
//                )
//            }
        },
        title = { Text(text = "Character List") },
        actions = {
            IconButton( onClick = onMenuClosed ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close icon"
                )
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun DefaultTopBarPreview(){
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    ListTopBar(scrollBehavior = scrollBehavior, onMenuClicked = {}) {

    }
}