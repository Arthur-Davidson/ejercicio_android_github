package mx.uacj.ejerciciointerfazpelicula

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import mx.uacj.ejerciciointerfazpelicula.ui.theme.EjercicioInterfazPeliculaTheme


enum class Pantallas{
    menu_inicio,
    opciones,
    heroes_caidos
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjercicioInterfazPeliculaTheme {
                // Llamamos a la funcion de navegacion
                AppNavegacion()
            }
        }
    }
}

@Composable
fun AppNavegacion() {
    var controlNavegacion by remember { mutableStateOf(Pantallas.menu_inicio) }

    // Simulacion de NavHost para trasladarse entre las pantallas
    when (controlNavegacion){
        Pantallas.menu_inicio -> Pantalla1(siguientePantalla = { controlNavegacion = Pantallas.opciones; Log.v("NAVHOST", "Valor de ${controlNavegacion}") })
        Pantallas.opciones -> Pantalla2(siguientePantalla = { controlNavegacion = Pantallas.heroes_caidos; Log.v("NAVHOST", "Valor de ${controlNavegacion}") })
        Pantallas.heroes_caidos -> Pantalla3()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    EjercicioInterfazPeliculaTheme {
        AppNavegacion()
    }
}
