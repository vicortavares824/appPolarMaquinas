package com.example.apppolarmaquinas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apppolarmaquinas.view.component.compButtom

@Preview(showBackground = true)
@Composable
fun IntroScreenPreview() {
    MaterialTheme {
        IntroScreen(onLoginClick = {}, onSignupClick = {})
    }
}

@Composable
fun IntroScreen(
    onLoginClick: () -> Unit = {},
    onSignupClick: () -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .background(
                Brush.linearGradient(
                    colors = listOf(
                        Color(0xFFD6F8F7),
                        Color(0xFFF3D8CE),
                        Color(0xFFF3FFF7)
                    )

                )
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

                Image(
                painter = painterResource(id = R.drawable.polar_maquinas),
                contentDescription = "Tela de exemplo",
                modifier = Modifier.size(120.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, Color.Red, CircleShape)
            )


            Spacer(modifier = Modifier.height(50.dp))

        }

        // chamar os callbacks de navegação
        compButtom(text = "Login", onClick = onLoginClick)
        compButtom(text = "Cadastrar", onClick = onSignupClick)

    }
}