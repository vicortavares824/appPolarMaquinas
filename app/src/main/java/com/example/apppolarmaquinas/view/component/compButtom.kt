package com.example.apppolarmaquinas.view.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.apppolarmaquinas.R

@Composable
fun compButtom(text: String, onClick: () -> Unit, colorRes: Int = R.color.red, int: Int = 120, circulo: Int = 50) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = colorRes)),
        shape = RoundedCornerShape(circulo.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = int.dp)
    ) {
        Text(text = text)
    }
}
