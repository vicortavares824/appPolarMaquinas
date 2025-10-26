package com.example.apppolarmaquinas

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import com.example.apppolarmaquinas.ui.theme.AppPolarMaquinasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Permite desenhar por trás da status bar / navigation bar
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            AppPolarMaquinasTheme {
                // Controlar cores/ícones das system bars dentro do Compose para garantir comportamento consistente
                val view = LocalView.current
                val isDarkTheme = isSystemInDarkTheme()
                SideEffect {
                    window.statusBarColor = Color.TRANSPARENT
                    window.navigationBarColor = Color.TRANSPARENT
                    val controller = WindowCompat.getInsetsController(window, view)
                    controller.isAppearanceLightStatusBars = !isDarkTheme
                    controller.isAppearanceLightNavigationBars = !isDarkTheme
                }

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(modifier = Modifier.systemBarsPadding()) {
                        AppNavGraph()
                    }
                }
            }
        }
    }
}
