package org.leegeonhui.project.root

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.leegeonhui.project.feature.MainScreen
import org.leegeonhui.project.feature.auth.login.LoginScreen

@Composable
fun NavGraph(
    navController: NavHostController,
) {
    NavHost(
        navController = navController,
        startDestination = NavGroup.LOGIN
    ){
        composable(NavGroup.MAIN){
            MainScreen(navController)
        }
        composable(NavGroup.LOGIN) {
            LoginScreen(navController)
        }

    }
}