package com.fflashtv.player.ui

import com.fflashtv.player.adblock.BraveAdBlockEngine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LiveTv
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {

    private val libraryViewModel: LibraryViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BraveAdBlockEngine.initializeAsync(applicationContext)

        setContent {
            MaterialTheme(colorScheme = darkColorScheme()) {
                val ui by libraryViewModel.ui.collectAsState()
                var selectedTab by rememberSaveable { mutableIntStateOf(0) }

                Scaffold(
                    bottomBar = {
                        NavigationBar {
                            NavigationBarItem(
                                selected = selectedTab == 0,
                                onClick = { selectedTab = 0 },
                                icon = { Icon(Icons.Default.LiveTv, contentDescription = null) },
                                label = { Text("المكتبة") }
                            )
                            NavigationBarItem(
                                selected = selectedTab == 1,
                                onClick = { selectedTab = 1 },
                                icon = { Icon(Icons.Default.Settings, contentDescription = null) },
                                label = { Text("المصادر والإعدادات") }
                            )
                        }
                    }
                ) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)) {
                        if (selectedTab == 0) {
                            LibraryScreen(
                                ui = ui,
                                viewModel = libraryViewModel,
                                onGoToSources = { selectedTab = 1 }
                            )
                        } else {
                            SourcesScreen(
                                ui = ui,
                                viewModel = libraryViewModel
                            )
                        }
                    }
                }
            }
        }
    }
}
