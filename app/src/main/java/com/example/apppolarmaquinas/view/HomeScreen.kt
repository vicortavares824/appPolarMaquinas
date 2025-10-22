package com.example.apppolarmaquinas.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.TextFieldDefaults
import com.example.apppolarmaquinas.view.component.CustomTextField

@Preview(name= "ordem e serviço",showBackground = true)
@Composable
fun HomeScreens() {
    val gradient = Brush.verticalGradient(
        listOf(Color(0xFFE85050), Color(0xFF00BCD4))
    )

    Scaffold(
        bottomBar = {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                color = Color(0xFFE85050),
                shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
                tonalElevation = 0.dp
            ) {
                NavigationBar(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Color.Transparent,
                    tonalElevation = 0.dp
                ) {
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { Icon(Icons.Outlined.Home, contentDescription = "Home", tint = Color.White) },
                        label = { Text("Ordem Serviços", color = Color.White, fontSize = 8.sp) }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { Icon(Icons.Outlined.List, contentDescription = "Prestados", tint = Color.White) },
                        label = { Text("Prestados", color = Color.White, fontSize = 8.sp) }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { Icon(Icons.Outlined.CheckCircle, contentDescription = "Concluído", tint = Color.White) },
                        label = { Text("Concluído", color = Color.White, fontSize = 8.sp) }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { Icon(Icons.Outlined.Build, contentDescription = "Ferramentas", tint = Color.White) },
                        label = { Text("Ferramentas", color = Color.White, fontSize = 8.sp) }
                    )
                    NavigationBarItem(
                        selected = false,
                        onClick = { },
                        icon = { Icon(Icons.Outlined.Person, contentDescription = "Funcionários", tint = Color.White) },
                        label = { Text("Funcionários", color = Color.White, fontSize = 8.sp) }
                    )
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFE85050))
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Bem-vindo",
                color = Color(0xFFFFFFFF),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
            Text("Funcionário", color = Color(0xFFFFFFFF))
            Spacer(Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                    .background(color = Color(0xFFFDFDFD))
            ) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    shape = RoundedCornerShape(20.dp),
                ) {
                    Box(modifier = Modifier.fillMaxSize().background(brush = gradient)) {
                        Column(Modifier.padding(16.dp)) {
                            CustomTextField("Nome Cliente", int = 10)
                            CustomTextField("Telefone", int = 10)
                            CustomTextField("Email", int = 10)
                            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Box(Modifier.weight(2f)) { CustomTextField("Rua", int = 10) }
                                Box(Modifier.weight(1f)) { CustomTextField("Nº", int = 5) }
                            }
                            CustomTextField("Cidade", int = 10)
                            CustomTextField("Tipo de serviço", int = 10)
                            CustomTextField("Descrição", int = 10)

                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ) {
                                IconButton(onClick = {}) {
                                    Icon(Icons.Default.PhotoCamera, contentDescription = "Foto 1")
                                }
                                IconButton(onClick = {}) {
                                    Icon(Icons.Default.PhotoCamera, contentDescription = "Foto 2")
                                }
                            }

                            CustomTextField("Assinatura", int = 10)
                        }
                    }
                }
            }
        }
    }
}

