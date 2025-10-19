package com.example.apppolarmaquinas.view.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.apppolarmaquinas.R

@Composable
fun compButtom(text: String, onClick: () -> Unit, colorRes: Int = R.color.red) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = colorRes)),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 120.dp)
    ) {
        Text(text = text)
    }
}
