package ejercicio19
//Crea una función que, dada una cadena de texto, elimine todas las vocales de la cadena.
fun eliminarVocales(texto: String): String {
    val vocales = "AEIOUaeiou"
    return texto.replace(Regex("[$vocales]"), "")
}
fun main() {
    val texto = "Estoy aprendiendo a programar"
    val textoSinVocales = eliminarVocales(texto)
    println("Texto original: $texto")
    println("Texto sin vocales: $textoSinVocales")
}
