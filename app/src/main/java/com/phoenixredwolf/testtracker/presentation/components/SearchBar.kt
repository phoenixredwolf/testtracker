package com.phoenixredwolf.testtracker.presentation.components

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.phoenixredwolf.testtracker.ui.theme.TesttrackerTheme

@Composable
fun SearchView(
    searchText: String,
    onTextChanged: (String) -> Unit,
    onSearchViewClosed: () -> Unit,
    modifier: Modifier = Modifier,
    expandedInit: Boolean = false
) {
    val (expanded, onExpandedChanged) = remember { mutableStateOf(expandedInit) }

    Crossfade(targetState = expanded) { isSearch ->
        when (isSearch) {
            true -> OpenSearchView(
                searchText = searchText,
                onTextChanged = onTextChanged,
                onSearchViewClosed = onSearchViewClosed,
                onExpandedChanged = onExpandedChanged,
                modifier = modifier
            )
            false -> ClosedSearchView(
                onExpandedChanged = onExpandedChanged,
                modifier = modifier
            )
        }

    }
}

@Composable
fun OpenSearchView(
    searchText: String,
    onSearchViewClosed: () -> Unit,
    onTextChanged: (String) -> Unit,
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    val focusManager = LocalFocusManager.current
    val textFieldFocus = remember { FocusRequester() }

    SideEffect { textFieldFocus.requestFocus() }

    var textFieldValue by remember {
        mutableStateOf(TextFieldValue(searchText, TextRange(searchText.length)))
    }

    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        IconButton(
            onClick = {
                onExpandedChanged(false)
                onSearchViewClosed()
            }
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back Arrow"
            )
        }
        TextField(
            value = textFieldValue,
            onValueChange = { value ->
                textFieldValue = value
                onTextChanged(value.text)
            },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search button"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .focusRequester(textFieldFocus),
            label = { Text(text = "Search" ) },
            keyboardOptions = KeyboardOptions( imeAction = ImeAction.Done ),
            keyboardActions = KeyboardActions( onDone = { focusManager.clearFocus() } )
        )
    }
}

@Composable
fun ClosedSearchView(
    onExpandedChanged: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Character List",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(start = 16.dp)
        )
        IconButton( onClick = { onExpandedChanged(true) }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Button"
            )
        }
    }
}

@Preview
@Composable
fun OpenSearchBarPreview() {
    TesttrackerTheme {
        Surface(
            color = MaterialTheme.colorScheme.primary
        ) {
            SearchView(
                searchText = "",
                onSearchViewClosed = {  },
                onTextChanged = {},
                expandedInit = true
            )
        }
    }
}

@Preview
@Composable
fun ClosedSearchBarPreview() {
    TesttrackerTheme {
        Surface(
            color = MaterialTheme.colorScheme.primary
        ) {
            SearchView(
                searchText = "",
                onTextChanged = {},
                onSearchViewClosed = {}
            )
        }
    }
}