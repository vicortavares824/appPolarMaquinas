package com.example.apppolarmaquinas.view.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun CustomTextField(
    label: String,
    int: Int = 40,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    isPassword: Boolean = false,
    onValueChange: (String) -> Unit = {},
    initialValue: String = ""
    ,circulo: Int = 10
) {
    var text by remember { mutableStateOf(initialValue) }
    var passwordVisible by remember { mutableStateOf(false) }


    val isPasswordField = isPassword || trailingIcon == Icons.Default.Lock

    val visualTransformation: VisualTransformation =
        if (isPasswordField && !passwordVisible) PasswordVisualTransformation() else VisualTransformation.None

    OutlinedTextField(
        value = text,
        onValueChange = {
            text = it
            onValueChange(it)
        },
        label = { Text(label) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = int.dp),
        leadingIcon = if (leadingIcon != null) {
            { Icon(leadingIcon, contentDescription = null) }
        } else null,
        trailingIcon = if (isPasswordField) {
            {
                val visibilityIcon = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(imageVector = visibilityIcon, contentDescription = if (passwordVisible) "Ocultar senha" else "Mostrar senha")
                }
            }
        } else if (trailingIcon != null) {
            { Icon(trailingIcon, contentDescription = null) }
        } else null,
        visualTransformation = visualTransformation,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedIndicatorColor = Color.Gray,
            unfocusedIndicatorColor = Color.LightGray
        ) ,shape = RoundedCornerShape(circulo.dp)
    )
}
