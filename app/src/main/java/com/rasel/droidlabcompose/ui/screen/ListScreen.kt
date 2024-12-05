package com.rasel.droidlabcompose.ui.screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rasel.droidlabcompose.sampleData
import com.rasel.droidlabcompose.ui.theme.DroidLabComposeTheme

@Composable
internal fun ListScreen(
    list: List<String>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
    ) {
        items(
            items = list,
        ) {
            ListItem(
                headlineContent = { Text(it) },
            )
            HorizontalDivider()
        }
    }
}

@Preview
@Composable
private fun PreviewListScreen() {
    DroidLabComposeTheme {
        ListScreen(list = sampleData)
    }
}
