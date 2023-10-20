package ejercicio28
//Crea una función que determine si una cadena de texto contiene solo
//caracteres alfabéticos (letras) y espacios en blanco.
fun main() {
    val texto1 = "Hola Mundo"
    val texto2 = "12345"
    val texto3 = "Texto con números: 42"

    println("Texto 1: ${contieneSoloLetrasYEspacios(texto1)}")
    println("Texto 2: ${contieneSoloLetrasYEspacios(texto2)}")
    println("Texto 3: ${contieneSoloLetrasYEspacios(texto3)}")
}

fun contieneSoloLetrasYEspacios(cadena: String): Boolean {
    val patron = Regex("^[A-Za-z ]+\$")
    return patron.matches(cadena)
}
