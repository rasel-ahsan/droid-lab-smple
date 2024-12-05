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
    "The quick brown rabbit jumps.",
    "Android is the most popular OS.",
    "Compose for building native UI.",
    "Kotlin is a statically typed.",
    "Jetpack Compose for native UI.",
    "Programming creates instructions.",
    "Long text should wrap to next line.",
    "Short text.",
    "Lorem ipsum dolor sit amet.",
    "Duis aute irure dolor.",
    "Lorem ipsum dolor sit amet.",
    "Duis aute irure dolor.",
    "Lorem ipsum dolor sit amet.",
    "Duis aute irure dolor.",
    "Lorem ipsum dolor sit amet.",
    "Duis aute irure dolor.",
    "Lorem ipsum dolor sit amet.",
    "Duis aute irure dolor.",
    "Lorem ipsum dolor sit amet.",
    "Duis aute irure dolor.",
)
