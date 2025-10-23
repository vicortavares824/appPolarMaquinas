package com.example.apppolarmaquinas.view

import android.text.style.BackgroundColorSpan
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppolarmaquinas.R
import com.example.apppolarmaquinas.view.component.FancyButton
import com.example.apppolarmaquinas.view.component.compButtom
import com.google.android.material.color.ColorResourcesOverride
import kotlin.Int
import com.example.apppolarmaquinas.ui.theme.AdlamFontFamily
import com.example.apppolarmaquinas.view.component.CustomTextField


@Composable
fun LoginScreen(onBack: () -> Unit = {},onHomeClick: () -> Unit) {

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
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .padding(vertical = 100.dp)   ,
            verticalArrangement = Arrangement.Top,
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

                Text("Ordem de serviço", fontSize = 30.sp, color = Color.Black, fontFamily = AdlamFontFamily)
                Text("Faça seu Login", fontSize = 30.sp, color = Color.Black,fontFamily = AdlamFontFamily)
                CustomTextField("Email",int =40,trailingIcon = Icons.Default.AccountCircle )
                CustomTextField("*******",int =40,trailingIcon = Icons.Default.Lock)
                compButtom(text = "Login", onClick = onHomeClick,int = 40, circulo = 10)


            }




        }
    }

}
