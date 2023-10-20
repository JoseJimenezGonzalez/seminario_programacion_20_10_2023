package ejercicio7

import java.lang.StringBuilder

fun main(){
    val texto = "Hoy es viernes, hay que descansar. Mañana será sábado."
    println(primeraLetraMayus(texto))
}

fun primeraLetraMayus(texto: String): String {
    val partes = texto.split(" ")
    val resultado = StringBuilder()
    partes.forEachIndexed { index, word ->
        val palabraRes = StringBuilder(word)
        palabraRes[0] = palabraRes[0].uppercaseChar()
        if (index > 0) {
            resultado.append(" ")
        }
        resultado.append(palabraRes)
    }
    return resultado.toString()
}