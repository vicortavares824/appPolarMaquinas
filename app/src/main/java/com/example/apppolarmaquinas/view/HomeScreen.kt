package com.example.apppolarmaquinas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.systemBarsPadding
import com.example.apppolarmaquinas.view.component.ComptMenuBox
import com.example.apppolarmaquinas.view.component.CustomTextField

@OptIn(ExperimentalMaterial3Api::class)
@Preview(name = "ordem e serviço", showBackground = true)
@Composable
fun HomeScreens() {
    val gradient = Brush.verticalGradient(
        listOf(Color(0xFFEB1C24), Color(0xFF00BCD4))
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFE85050))
            .systemBarsPadding(),
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


        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .heightIn(min = 520.dp),
            shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp),
            color = Color(0xFFFDFDFD),
            tonalElevation = 4.dp
        ) {

            Column(modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)) {

                Text("Ordem de Serviços", color = Color(0xFF000000))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    shape = RoundedCornerShape(20.dp),
                ) {
                    Box(modifier = Modifier
                        .fillMaxSize()
                        .background(brush = gradient)) {
                        Column(Modifier.padding(16.dp)) {
                            CustomTextField("Nome Cliente", int = 10)
                            CustomTextField("Telefone", int = 10)
                            CustomTextField("Email", int = 10)
                            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                Box(Modifier.weight(2f)) { CustomTextField("Rua", int = 10) }
                                Box(Modifier.weight(1f)) { CustomTextField("Nº", int = 5) }
                            }
                            CustomTextField("Cidade", int = 10)

                            ComptMenuBox(listOf("Gás", "Hidráulico", "Eletrico", "Pneumático", "Irrigação","Manutenção de Maquinas","outro"), selectedService = "", onServiceSelected = {} , modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 10.dp))


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
