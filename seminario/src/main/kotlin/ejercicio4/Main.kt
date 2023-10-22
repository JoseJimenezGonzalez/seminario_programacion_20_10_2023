package ejercicio4
//Crea una función que determine si una cadena de texto es un palíndromo.
fun main(){
    val texto = "Dábale arroz a la zorra el abad"
    println("¿$texto es un palíndromo? ${esPalindromo(texto)}")
}

fun esPalindromo(texto: String): Boolean{
    var res = false
    val textoLimpio = quitarAcentos(texto).replace(Regex("[^A-Za-z0-9]"), "").lowercase()
    val textoPalindromo = textoLimpio.reversed()
    return textoLimpio == textoPalindromo
}
fun quitarAcentos(texto: String): String{
    val builder = StringBuilder(texto)
    texto.forEachIndexed { indice, caracter ->
        when (caracter) {
            'á' -> builder[indice] = 'a'
            'é' -> builder[indice] = 'e'
            'í' -> builder[indice] = 'i'
            'ó' -> builder[indice] = 'o'
            'ú' -> builder[indice] = 'u'
            'ü' -> builder[indice] = 'u'
            'Á' -> builder[indice] = 'A'
            'É' -> builder[indice] = 'E'
            'Í' -> builder[indice] = 'I'
            'Ó' -> builder[indice] = 'O'
            'Ú' -> builder[indice] = 'U'
            'Ü' -> builder[indice] = 'U'
        }
    }
    return builder.toString()
}