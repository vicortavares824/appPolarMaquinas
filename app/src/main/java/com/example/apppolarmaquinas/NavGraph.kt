package com.example.apppolarmaquinas

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.apppolarmaquinas.view.LoginScreen
import com.example.apppolarmaquinas.view.SignupScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "intro") {
        composable("intro") {
            IntroScreen(
                onLoginClick = { navController.navigate("login") },
                onSignupClick = { navController.navigate("signup") }
            )
        }
        composable("login") {
            LoginScreen(onBack = { navController.popBackStack() })
        }
        composable("signup") {
            SignupScreen(onBack = { navController.popBackStack() })
        }
    }
}
