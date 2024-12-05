package com.rasel.droidlabcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import com.rasel.droidlabcompose.data.model.ListItemData
import com.rasel.droidlabcompose.ui.screen.ListScreen
import com.rasel.droidlabcompose.ui.theme.DroidLabComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DroidLabComposeTheme(
                darkTheme = false,
            ) {
                AppContent()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppContent() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Droid Lab Sample")
                },
                modifier = Modifier.shadow(elevation = 4.dp),
            )
        }
    ) { innerPadding ->
        ListScreen(
            list = sampleData,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
        )
    }
}

val sampleData = listOf(
    ListItemData("The quick brown rabbit", "jumps over the lazy frogs", "Animals"),
    ListItemData("Android", "is the most popular mobile operating system", "Technology"),
    ListItemData("Compose", "for building native UI for Android applications", "Technology"),
    ListItemData("Kotlin", "is a statically typed programming language", "Technology"),
    ListItemData("Jetpack Compose", "is a modern toolkit for building native UI", "Technology"),
    ListItemData("Programming", "creates instructions for computers", "Technology"),
    ListItemData("Long text", "should wrap to the next line", "General"),
    ListItemData("Short text", "is concise and to the point", "General"),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit", "Latin"),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate", "Latin"),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit, sed do eiusmod", "Latin"),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse cillum dolore", "Latin"),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor", "Latin"),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse", "Latin"),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit", "Latin"),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate", "Latin"),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit, sed do", "Latin"),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse cillum", "Latin"),
)
