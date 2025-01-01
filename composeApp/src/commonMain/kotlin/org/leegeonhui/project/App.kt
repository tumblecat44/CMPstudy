package org.leegeonhui.project

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.leegeonhui.project.root.NavGraph

@Composable
@Preview
fun App() {
    val navController = rememberNavController()
    MaterialTheme {
        NavGraph(navController)
    }
}