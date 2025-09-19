package mx.uacj.ejerciciointerfazpelicula

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// Referencia: https://www.youtube.com/watch?v=t-XbDgXvNhI Minuto: 1:09

@Composable
fun Pantalla2(siguientePantalla: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6DF7EC)) // Fondo de pantalla
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Reutilizamos el mismo estilo para todos los botones
        // TODOS LO BOTONES FUNCIONAN PARA IR A LA MISMA PANTALLA
        val buttonModifier = Modifier
            .fillMaxWidth()
            .height(56.dp)

        val buttonColors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFE6FCFC), // Fondo del botón
            contentColor = Color.Black          // Color del texto
        )

        val buttonShape = RoundedCornerShape(8.dp) // Bordes mas cuadrados

        //Boton 1: Islas
        Button(
            onClick = {
                siguientePantalla()
                Log.v("NAVHOST", "Estamos en pantalla 1")
            },
            modifier = buttonModifier,
            colors = buttonColors,
            shape = buttonShape
        ) {
            Text("Islas de Operaciones",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))
        //Boton 2: Finanzas

        Button(
            onClick = {
                siguientePantalla()
                Log.v("NAVHOST", "Estamos en pantalla 1")
            },
            modifier = buttonModifier,
            colors = buttonColors,
            shape = buttonShape
        ) {
            Text("Finanzas",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))
        //Boton 3: Omnidroides

        Button(
            onClick = {
                siguientePantalla()
                Log.v("NAVHOST", "Estamos en pantalla 1")
            },
            modifier = buttonModifier,
            colors = buttonColors,
            shape = buttonShape
        ) {
            Text("Meta-entrenamiento de omnidroides",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))
        //Boton 4: Heroes
        Button(
            onClick = {
                siguientePantalla()
                Log.v("NAVHOST", "Estamos en pantalla 1")
            },
            modifier = buttonModifier,
            colors = buttonColors,
            shape = buttonShape
        ) {
            Text("Heroes",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Pantalla2Preview() {
    Pantalla2(siguientePantalla = {})
}
