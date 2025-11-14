// kotlin
package com.example.apppolarmaquinas.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apppolarmaquinas.view.component.CustomTextField

@Preview(name = "Serviços Prestados", showBackground = true)
@Composable
fun PrestadosScreen() {

    val gradient = Brush.verticalGradient(
        listOf(Color(0xFFEB1C24), Color(0xFF00BCD4))
    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE85050))
            .padding(top = 20.dp, start = 20.dp, end = 20.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
        ) {

            Box(
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.TopCenter)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color.White)
                    .shadow(8.dp, RoundedCornerShape(50.dp))
            ) {

            }

            Text(
                "Bem Vindo",
                color = Color.White,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp)
            )
            Text(
                "Funcionário",
                color = Color.White,
                modifier = Modifier.padding(top = 35.dp, start = 10.dp),
                textAlign = TextAlign.Center)
            Spacer(Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .size(45.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = (-16).dp, y = 10.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(Color.White)
                    .shadow(6.dp, RoundedCornerShape(50.dp))
            ) {
                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Configurações",
                    tint = Color.Black,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        Spacer(Modifier.height(10.dp))


        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color(0xFFE85050),  // verde bem claro
                            Color(0xFF33CBF0)   // vermelho suave
                        )
                    )
                )
                .padding(20.dp)
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {

                Card(
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(10.dp, RoundedCornerShape(20.dp))
                        .background(Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                    ) {

                        Text(
                            "Cadastro de Serviços",
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                        CustomTextField("Nome do Serviço", 10)
                        Spacer(Modifier.height(10.dp))
                        CustomTextField("Descrição", 10)

                        Spacer(Modifier.height(16.dp))

                        Button(
                            onClick = {},
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFEB1C24)
                            ),
                            shape = RoundedCornerShape(12.dp)
                        ) {
                            Text(
                                "Cadastrar",
                                color = Color.White,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }

                Spacer(Modifier.height(32.dp))

                Card(
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .shadow(10.dp, RoundedCornerShape(20.dp))
                        .background(Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {

                        Text(
                            "Serviços Cadastrados",
                            color = Color.Black,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "Instalação de Gás",
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "Elétrica",
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "Manutenção Geral",
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "Manutenção Compressores",
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "Marido de Aluguel",
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                        Text(
                            "Montagem Geral",
                            color = Color.Gray,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(Modifier.height(16.dp))

                    }
                }
            }
        }
    }
}


