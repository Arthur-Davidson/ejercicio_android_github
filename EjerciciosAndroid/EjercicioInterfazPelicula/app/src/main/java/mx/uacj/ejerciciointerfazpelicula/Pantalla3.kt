package mx.uacj.ejerciciointerfazpelicula

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
            .background(Color(0xFF000000)) // Fondo de la pantalla
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Primer recuadro
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .border(3.dp, Color(0xFF118C1B))
                .background(Color(0xFF)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Oponente:",
                color = Color(0xFF36A73F),
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
                .border(3.dp, Color(0xFF118C1B))
                .background(Color(0xFF118C1B)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Reina Xenomorfo",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
        //Descripcion
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(3.dp, Color(0xFF00730A))
                .background(Color(0xFF00730A)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Habilidades: Mide 9 MTS, escupe acido, tiene 4 brazos, controla Xenomorfos",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(3.dp, Color(0xFF00730A))
                .background(Color(0xFF00730A)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Estado: Se la tasajearon y la hicieron caldo y botas",
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
                .border(3.dp, Color(0xFF118C1B))
                .background(Color(0xFF)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Text(
                text = "Contramedida:",
                color = Color(0xFF36A73F),
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
                .border(3.dp, Color(0xFF118C1B))
                .background(Color(0xFF118C1B)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Space Marines",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )
        }
        //Descripcion
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(25.dp)
                .border(3.dp, Color(0xFF00730A))
                .background(Color(0xFF00730A)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Habilidades: Plomazos, Cuchillazos, Granadazos y Fe en Cristo",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp
            )

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(25.dp)
                .border(3.dp, Color(0xFF00730A))
                .background(Color(0xFF00730A)) // Fondo del recuadro
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter,
        ) {
            Text(
                text = "Estado: Vencedores",
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
