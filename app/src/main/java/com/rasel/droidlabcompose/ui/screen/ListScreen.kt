package com.rasel.droidlabcompose.ui.screen

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rasel.droidlabcompose.data.model.ListItemData
import com.rasel.droidlabcompose.sampleData
import com.rasel.droidlabcompose.ui.theme.DroidLabComposeTheme

@Composable
internal fun ListScreen(
    list: List<ListItemData>,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
    ) {
        items(
            items = list,
        ) { item ->
            ListItem(
                headlineContent = { Text(item.title) },
                supportingContent = { Text(item.subtitle) },
                overlineContent = { Text(item.category) },
                leadingContent = {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(54.dp),
                    )
                },
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
