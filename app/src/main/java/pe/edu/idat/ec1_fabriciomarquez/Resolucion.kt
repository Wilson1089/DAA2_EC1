package pe.edu.idat.ec1_fabriciomarquez

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Examen(){

    var preguntaActual by remember {
        mutableStateOf(1)
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 35.dp, start = 25.dp, end = 25.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(onClick = { preguntaActual = 1 }) {
                Text("P1")
            }

            Spacer(modifier = Modifier.size(16.dp))

            Button(onClick = { preguntaActual = 2 }) {
                Text("P2")
            }

            Spacer(modifier = Modifier.size(16.dp))

            Button(onClick = { preguntaActual = 3 }) {
                Text("P3")
            }

            Spacer(modifier = Modifier.size(16.dp))

            Button(onClick = { preguntaActual = 4 }) {
                Text("P4")
            }
        }
        Spacer(modifier = Modifier.size(16.dp))

        when (preguntaActual) {
            1 -> Pregunta1()
            2 -> Pregunta2()
            3 -> Pregunta3()
            4 -> Pregunta4()
        }

    }

}

@Composable
fun Pregunta1() {
    Text("Pregunta 1")
}

@Composable
fun Pregunta2() {
    Text("Pregunta 2")
}

@Composable
fun Pregunta3() {
    Text("Pregunta 3")
}

@Composable
fun Pregunta4() {
    Text("Pregunta 4")
}






fun Calcular1(indicador: Char, tasa: Float):String{
    var respuesta = "Indicador no valido"
    if (indicador == 'C' || indicador == 'A' || indicador == 'T' || indicador == 'M') {

        respuesta = if (tasa > 0.5 && indicador == 'T') {

            "Positivo"

        } else if (tasa > 0.3) {

            "Positivo"

        } else {

            "Negativo"
        }
    }

    return respuesta
}

fun Calcular2(numero1: Int, numero2 : Int): Int{

    val respuesta = if (numero1 == numero2){
        numero1 * numero2

    }else if (numero1 > numero2){
        numero1 - numero2

    }else{
        numero1 + numero2
    }
    return respuesta
}

fun Calcular3(numero: Int): String {
    return when (numero) {
        1 -> "Enero"
        2 -> "Febrero"
        3 -> "Marzo"
        4 -> "Abril"
        5 -> "Mayo"
        6 -> "Junio"
        7 -> "Julio"
        8 -> "Agosto"
        9 -> "Septiembre"
        10 -> "Octubre"
        11 -> "Noviembre"
        12 -> "Diciembre"
        else -> "Numero no valido. Ingresar un número entre 1 y 12"
    }
}

fun Calcular4(numero: Int): Int {
    var suma: Int = numero % 10
    suma += (numero-suma)/10
    return suma
}


