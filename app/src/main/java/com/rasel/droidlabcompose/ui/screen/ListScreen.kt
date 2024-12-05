package com.rasel.droidlabcompose.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.rasel.droidlabcompose.R
import com.rasel.droidlabcompose.data.model.ListItemData
import com.rasel.droidlabcompose.sampleData
import com.rasel.droidlabcompose.ui.theme.DroidLabComposeTheme
import kotlin.random.Random

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
            val favouriteIcon =
                if (Random.nextBoolean()) Icons.Default.FavoriteBorder else Icons.Default.Favorite
            ListItem(
                headlineContent = { Text(item.title) },
                supportingContent = { Text(item.subtitle) },
                overlineContent = { Text(item.category) },
                leadingContent = { NetworkImage(imageUrl = item.imageUrl) },
                trailingContent = { Icon(favouriteIcon, contentDescription = null) },
                modifier = Modifier.clickable {
                    // Handle item click
                },
            )
            HorizontalDivider()
        }
    }
}

@Composable
private fun NetworkImage(imageUrl: String) {
    val imageModifier = Modifier
        .size(60.dp)
        .background(color = Color.Transparent, shape = RoundedCornerShape(30.dp))
        .clip(RoundedCornerShape(30.dp))
    if (LocalInspectionMode.current) {
        Image(
            painter = painterResource(R.mipmap.ic_launcher),
            contentDescription = null,
            modifier = imageModifier,
        )
    } else {
        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            modifier = imageModifier,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewListScreen() {
    DroidLabComposeTheme {
        ListScreen(list = sampleData)
    }
}
