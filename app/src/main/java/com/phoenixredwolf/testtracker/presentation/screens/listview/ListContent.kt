package com.phoenixredwolf.testtracker.presentation.screens.listview

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.phoenixredwolf.testtracker.data.model.RelatedTopic
import com.phoenixredwolf.testtracker.ui.theme.TesttrackerTheme
import com.phoenixredwolf.testtracker.utility.getName
import com.phoenixredwolf.testtracker.utility.mockData

@Composable
fun ListContent(
    paddingValues: PaddingValues,
    characters: List<RelatedTopic>,
    onClick: (RelatedTopic) -> Unit
) {
    if (characters.isNotEmpty()) {
        LazyColumn(
            modifier = Modifier
                .padding(horizontal = 24.dp )
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(top = paddingValues.calculateTopPadding())
        ) {
            items(items = characters) { relatedTopic ->
                Card(
                    modifier = Modifier
                        .padding(2.dp)
                        .fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(8.dp),
                    content = { relatedTopic.FirstURL?.let {
                        Text(
                            text = getName(it),
                            modifier = Modifier.padding(8.dp)
                        )
                    } }
                )
            }
        }
    }
}

@Preview
@Composable
fun ListContentPreview() {
    TesttrackerTheme {
        ListContent(
            paddingValues = PaddingValues(8.dp),
            characters = mockData.RelatedTopics as List<RelatedTopic>,
            onClick = {})
    }
}