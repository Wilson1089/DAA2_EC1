package pe.edu.idat.ec1_fabriciomarquez

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Examen(){

    var preguntaActual by remember {
        mutableIntStateOf(1)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 35.dp, start = 25.dp, end = 25.dp, bottom = 50.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Button(onClick = { preguntaActual = 1 }) {
                Text("P1")
            }

            MySpace(16)

            Button(onClick = { preguntaActual = 2 }) {
                Text("P2")
            }

            MySpace(16)

            Button(onClick = { preguntaActual = 3 }) {
                Text("P3")
            }

            MySpace(16)

            Button(onClick = { preguntaActual = 4 }) {
                Text("P4")
            }
        }
        MySpace(16)

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
    Box(modifier =  Modifier.fillMaxSize()) {
        var indi by remember { mutableStateOf("") }
        var tas by remember { mutableStateOf("0") }
        var resultado by remember { mutableStateOf("") }

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Primera Pregunta", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(), style = TextStyle(fontWeight= FontWeight.Bold, fontSize = 30.sp))

            MySpace(16)

            OutlinedTextField(value = indi, onValueChange = {indi = it}, modifier = Modifier.fillMaxWidth(), label = {
                Text(text = "Ingrese Indicador"
                ) }, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text))

            MySpace(16)

            OutlinedTextField(value = tas, onValueChange = {tas = it}, modifier = Modifier.fillMaxWidth(), label = {
                Text(text = "Ingrese Tasa"
                ) }, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal))

            MySpace(16)

            Button(onClick = { resultado = calcular1(indi, tas.toFloat())}, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Calcular")
            }

            MySpace(16)

            Text(text = resultado, style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray))
        }
    }

}

@Composable
fun Pregunta2() {
    Box(modifier =  Modifier.fillMaxSize()) {
        var n1 by remember { mutableStateOf("0") }
        var n2 by remember { mutableStateOf("0") }
        var resultado by remember { mutableStateOf("") }

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Segunda Pregunta", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(), style = TextStyle(fontWeight= FontWeight.Bold, fontSize = 30.sp))

            MySpace(16)

            OutlinedTextField(value = n1, onValueChange = {n1 = it}, modifier = Modifier.fillMaxWidth(), label = {
                Text(text = "Numero 1"
                ) }, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

            MySpace(16)

            OutlinedTextField(value = n2, onValueChange = {n2= it}, modifier = Modifier.fillMaxWidth(), label = {
                Text(text = "Numero 2"
                ) }, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal))

            MySpace(16)

            Button(onClick = { resultado = calcular2(n1.toInt(), n2.toInt())}, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Calcular")
            }

            MySpace(16)

            Text(text = resultado, style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray))
        }
    }
}

@Composable
fun Pregunta3() {
    Box(modifier =  Modifier.fillMaxSize()) {
        var num by remember { mutableStateOf("0") }
        var resultado by remember { mutableStateOf("") }

        Column(modifier = Modifier.fillMaxSize()) {
            Text(text = "Tercera Pregunta", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(), style = TextStyle(fontWeight= FontWeight.Bold, fontSize = 30.sp))

            MySpace(16)

            OutlinedTextField(value = num, onValueChange = {num = it}, modifier = Modifier.fillMaxWidth(), label = {
                Text(text = "Ingrese un numero"
                ) }, maxLines = 1, singleLine = true, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number))

            MySpace(16)

            Button(onClick = { resultado = calcular3(num.toInt())}, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Calcular")
            }

            MySpace(16)

            Text(text = resultado, style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray))
        }
    }
}

@Composable
fun Pregunta4() {
    Box(modifier =  Modifier.fillMaxSize()) {
        var imprimir by remember {mutableStateOf(false) }
        Column(modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState())) {
            Text(text = "Cuarta Pregunta", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(), style = TextStyle(fontWeight= FontWeight.Bold, fontSize = 30.sp))

            MySpace(16)

            Button(onClick = {imprimir = true}, modifier = Modifier.fillMaxWidth()) {
                Text(text = "Mostrar")
            }

            MySpace(16)

            if (imprimir) {
                for (i in 23..99) {
                    Text(text = "La suma de los digitos de $i es: ${calcular4(i)}", style = TextStyle(fontWeight = FontWeight.Bold, color = Color.DarkGray))
                }
            }

        }
    }
}

@Composable
fun MySpace(espacio: Int){
    Spacer(modifier = Modifier.size(espacio.dp))
}

fun calcular1(indicador: String, tasa: Float):String{
    var respuesta = "Indicador no valido"
    if (indicador == "C" || indicador == "A" || indicador == "T" || indicador == "M") {

        respuesta = if (tasa > 0.5 && indicador == "T") {

            "Positivo"

        } else if (tasa > 0.3 && indicador != "T") {

            "Positivo"

        } else {

            "Negativo"
        }
    }

    return respuesta
}

fun calcular2(numero1: Int, numero2 : Int): String{

    val (respuesta, mensaje) = if (numero1 == numero2){
        Pair(numero1 * numero2, "multiplicaron")
    } else if (numero1 > numero2) {
        Pair(numero1 - numero2, "restaron")
    } else {
        Pair(numero1 + numero2, "sumaron")
    }

    return "Los numeros se $mensaje, la respuesta es $respuesta"
}

fun calcular3(numero: Int): String {
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

fun calcular4(numero: Int): Int {
    var suma: Int = numero % 10
    suma += (numero-suma)/10
    return suma
}


