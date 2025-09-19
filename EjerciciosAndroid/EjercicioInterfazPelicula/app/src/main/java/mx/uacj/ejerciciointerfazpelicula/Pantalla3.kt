package mx.uacj.ejerciciointerfazpelicula

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Pantalla3() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF6DF7EC)) // Fondo de la pantalla
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Primer recuadro
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFE6FCFC)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Oponente: xxxxx",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Segundo recuadro
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color(0xFFE6FCFC)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Text(
                text = "Prototipo: xxxxx",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
