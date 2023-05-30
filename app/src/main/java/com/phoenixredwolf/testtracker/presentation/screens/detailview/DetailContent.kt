package com.phoenixredwolf.testtracker.presentation.screens.detailview

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.phoenixredwolf.testtracker.R
import com.phoenixredwolf.testtracker.data.model.RelatedTopic
import com.phoenixredwolf.testtracker.ui.theme.TesttrackerTheme
import com.phoenixredwolf.testtracker.utility.mockData

@Composable
fun DetailContent(
    paddingValues: PaddingValues,
    character: RelatedTopic
) {
    val url = character.Icon?.URL
    val painter = if (url?.isNotBlank() == true) {
        rememberAsyncImagePainter(model = url)
    } else {
        painterResource(R.drawable.no_image_icon)
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painter,
            contentDescription = "Character Image",
            modifier = Modifier.fillMaxHeight(0.3f),
            contentScale = ContentScale.Fit,
        )
        Card(
            elevation = CardDefaults.cardElevation(8.dp),
            content = {
                character.Text?.let {
                    Text(
                        text = it,
                        modifier = Modifier.padding(8.dp),
                        style = TextStyle(
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                            fontWeight = FontWeight.SemiBold
                        )
                    )
                }
            }
        )
    }

}

@Preview
@Composable
fun DetailContentDefaultPreview() {
    TesttrackerTheme {
        mockData.RelatedTopics?.get(0)
            ?.let { DetailContent(paddingValues = PaddingValues(8.dp), character = it) }
    }
}