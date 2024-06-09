package pe.edu.idat.ec1_fabriciomarquez

class Resolucion {
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
}