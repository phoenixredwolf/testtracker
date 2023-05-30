package com.phoenixredwolf.testtracker.presentation.screens.listview

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.phoenixredwolf.testtracker.data.model.CharacterResponse
import com.phoenixredwolf.testtracker.data.model.RelatedTopic
import com.phoenixredwolf.testtracker.presentation.components.SearchView
import com.phoenixredwolf.testtracker.ui.theme.TesttrackerTheme
import com.phoenixredwolf.testtracker.utility.mockData

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListView(
    characters: CharacterResponse,
    onItemClicked: (RelatedTopic) -> Unit,
    onTextChanged: (String) -> Unit,
    onSearchViewClosed: () -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollBehavior = TopAppBarDefaults.exitUntilCollapsedScrollBehavior()
    val searchText by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            SearchView(
                searchText = searchText,
                onTextChanged = onTextChanged,
                onSearchViewClosed = onSearchViewClosed
            )
        },
        content = {
            ListContent(paddingValues = it,
                characters = characters.RelatedTopics as List<RelatedTopic>,
                onClick = onItemClicked)
        }
    )
}

@Preview
@Composable
fun ListViewDefaultPreview() {
    TesttrackerTheme {
        ListView(
            characters = mockData,
            onItemClicked = {},
            onTextChanged = {},
            onSearchViewClosed = { })
    }
}