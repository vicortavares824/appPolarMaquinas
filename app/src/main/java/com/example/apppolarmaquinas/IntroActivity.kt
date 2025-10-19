package com.example.apppolarmaquinas

import android.os.Bundle

import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.ComponentActivity
import com.example.apppolarmaquinas.ui.theme.AppPolarMaquinasTheme

class IntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppPolarMaquinasTheme {
                AppNavGraph()
            }
        }
    }
}
