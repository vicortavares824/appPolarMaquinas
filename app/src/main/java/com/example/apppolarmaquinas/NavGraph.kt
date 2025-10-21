package com.example.apppolarmaquinas

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.apppolarmaquinas.view.HomeScreens
import com.example.apppolarmaquinas.view.LoginScreen
import com.example.apppolarmaquinas.view.SignupScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val bottomBarRoutes = listOf("home", "prestados", "concluido", "ferramentas", "funcionarios")

    Scaffold(
        bottomBar = {
            if (currentRoute in bottomBarRoutes) {
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                    color = Color(0xFFEB1C24),
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
                    tonalElevation = 0.dp
                ) {
                    NavigationBar(containerColor = Color.Transparent, modifier = Modifier.fillMaxSize(), tonalElevation = 0.dp) {
                        val items = listOf("home", "prestados", "concluido", "ferramentas", "funcionarios")
                        items.forEach { route ->
                            NavigationBarItem(
                                selected = currentRoute == route,
                                onClick = {
                                    if (currentRoute != route) {
                                        navController.navigate(route) {
                                            launchSingleTop = true
                                            restoreState = true
                                            popUpTo(navController.graph.startDestinationId) {
                                                saveState = true
                                            }
                                        }
                                    }
                                },
                                icon = {
                                    val icon = when (route) {
                                        "home" -> Icons.Outlined.Home
                                        "prestados" -> Icons.Outlined.List
                                        "concluido" -> Icons.Outlined.CheckCircle
                                        "ferramentas" -> Icons.Outlined.Build
                                        else -> Icons.Outlined.Person
                                    }
                                    Icon(icon, contentDescription = route, tint = Color.White)
                                },
                                label = { Text(text = when (route) {
                                    "home" -> "Ordem Serviços"
                                    "prestados" -> "Prestados"
                                    "concluido" -> "Concluído"
                                    "ferramentas" -> "Ferramentas"
                                    else -> "Funcionários"
                                }, color = Color.White, fontSize = 10.sp) }
                            )
                        }
                    }
                }
            }
        }
    ) { innerPadding ->
        NavHost(navController = navController, startDestination = "intro", modifier = Modifier.fillMaxSize().padding(innerPadding)) {
            composable("intro") {
                IntroScreen(
                    onLoginClick = { navController.navigate("login") },
                    onSignupClick = { navController.navigate("signup") }
                )
            }
            composable("login") {
                LoginScreen(onBack = { navController.popBackStack() },onClick= {navController.navigate("home")})
            }
            composable("signup") {
                SignupScreen(onBack = { navController.popBackStack() })
            }

            // Rotas do app com bottom bar
            composable("home") { HomeScreens() }
            composable("prestados") { /* TODO: sua tela Prestados */ }
            composable("concluido") { /* TODO: sua tela Concluído */ }
            composable("ferramentas") { /* TODO: sua tela Ferramentas */ }
            composable("funcionarios") { /* TODO: sua tela Funcionários */ }
        }
    }
}
