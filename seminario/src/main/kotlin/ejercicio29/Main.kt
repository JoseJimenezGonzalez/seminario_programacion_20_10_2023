package ejercicio29
//Crea una función que determine si una cadena de texto es un
//anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
//pero en un orden diferente.
fun sonAnagramas(cadena1: String, cadena2: String): Boolean {

    val cadenaFormateada1 = cadena1.replace("[^A-Za-z]".toRegex(), "").toLowerCase()
    val cadenaFormateada2 = cadena2.replace("[^A-Za-z]".toRegex(), "").toLowerCase()


    if (cadenaFormateada1.length != cadenaFormateada2.length) {
        return false
    }


    return cadenaFormateada1.toCharArray().sorted() == cadenaFormateada2.toCharArray().sorted()
}

fun main() {
    val texto1 = "Alborota"
    val texto2 = "Rata, lobo"
    val texto3 = "hello"
    val texto4 = "world"

    println("¿'Alborota' y 'Rata, lobo' son anagramas? ${sonAnagramas(texto1, texto2)}")
    println("¿'hello' y 'world' son anagramas? ${sonAnagramas(texto3, texto4)}")
}
