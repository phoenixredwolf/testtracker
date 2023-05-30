package com.phoenixredwolf.testtracker.presentation.screens.detailview

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.phoenixredwolf.testtracker.data.model.RelatedTopic
import com.phoenixredwolf.testtracker.ui.theme.TesttrackerTheme
import com.phoenixredwolf.testtracker.utility.mockData

@Composable
fun DetailView(
    character: RelatedTopic,
    modifier: Modifier
){
    Scaffold {
        DetailContent(paddingValues = it, character = character)
    }
}

@Preview
@Composable
fun DetailViewDefaultPreview() {
    TesttrackerTheme {
        val character = mockData.RelatedTopics?.get(5)!!
        DetailView(character = character, modifier = Modifier)
    }
}