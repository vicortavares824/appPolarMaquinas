package com.example.apppolarmaquinas.view

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppolarmaquinas.R
import com.example.apppolarmaquinas.view.component.FancyButton
import com.google.android.material.color.ColorResourcesOverride
import kotlin.Int

@Preview
@Composable
fun LoginScreen(onBack: () -> Unit = {}) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding() // evita que o conteúdo fique sob a status bar

            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFD6F8F7),
                        Color(0xFFF3D8CE)

                    )

                )
            ),

        contentAlignment = Alignment.TopStart
    ) {
        FancyButton(
            text = "Voltar",
            icon = Icons.Default.ArrowBackIosNew,onClick = onBack,
            gradientColors = listOf(Color(0xFF03A9F4), Color(0x99FF0004))

        )
    }
}


