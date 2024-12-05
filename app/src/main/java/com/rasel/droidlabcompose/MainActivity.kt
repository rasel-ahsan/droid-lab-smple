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
    ListItemData("The quick brown rabbit", "jumps over the lazy frogs and the quick brown fox jumps over the lazy dog."),
    ListItemData("Android", "is the most popular mobile operating system in the world."),
    ListItemData("Compose", "for building native UI for Android applications."),
    ListItemData("Kotlin", "is a statically typed programming language that targets the JVM."),
    ListItemData("Jetpack Compose", "is a modern toolkit for building native UI for Android."),
    ListItemData("Programming", "creates instructions for computers to follow and execute."),
    ListItemData("Long text", "should wrap to the next line when it exceeds the available width."),
    ListItemData("Short text", "is concise and to the point."),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit."),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit."),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."),
    ListItemData("Lorem ipsum", "dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."),
    ListItemData("Duis aute", "irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."),
)
