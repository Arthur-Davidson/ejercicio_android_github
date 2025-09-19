package mx.uacj.ejerciciointerfazpelicula

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp


@Composable
//Trasladarse a otra pantalla
fun Pantalla1(siguientePantalla: () -> Unit) {
    var text by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .background(Color(0xFF6DF7EC)), // Fondo de pantalla
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Rectangulo de texto
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Contraseña") },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .background(Color(0xFFE6FCFC)) // Fondo del TextField
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Boton para navegar a la siguiente pantalla como si ingresara con una contraseña
        Button(
            onClick = {
                siguientePantalla()
                Log.v("NAVHOST", "Estamos en pantalla 1")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF357070), // Color del boton
                contentColor = Color.White, // Color del text
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        ) {
            Text("Ingresar")
        }
    }
}


