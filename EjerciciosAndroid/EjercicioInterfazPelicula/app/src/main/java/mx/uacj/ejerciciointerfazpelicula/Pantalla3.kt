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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

// Referencia: https://www.youtube.com/watch?v=t-XbDgXvNhI Minuto: 1:13
// La Interfaz se modifico a una version en vertical

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
                text = "Oponente:",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        //Nombre
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Color(0xFF357070)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Universal Man",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
        //Descripcion
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color(0xFF357070)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Poderes: Manipulacion de densidad atomica",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp
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
                text = "Prototipo:",
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        //Nombre
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Color(0xFF357070)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Omnidroide v. X1",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
        //Descripcion
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .background(Color(0xFF357070)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Habilidades: Locomocion intercambiable",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Pantalla3Preview() {
    Pantalla3() // Ahora el nombre de la función del preview es diferente
}
