package ejercicio29
//Crea una función que determine si una cadena de texto es un
//anagrama de otra cadena. Dos palabras son anagramas si tienen las mismas letras,
//pero en un orden diferente.
fun main(){
    val texto1 = "Alborota"
    val texto2 = "Rata, lobo"
    println("¿$texto1 y $texto2 son anagramas? ${esAnagrama(texto1, texto2)}")
}

fun esAnagrama(texto1: String, texto2: String): Boolean{
    var res = false
    val textoLimpio1 = texto1.replace("[^a-zA-Z0-9]".toRegex(), "").replace("\\s".toRegex(), "")
    val textoLimpio2 = texto2.replace("[^a-zA-Z0-9]".toRegex(), "").replace("\\s".toRegex(), "")
    if(textoLimpio1 != textoLimpio2 && textoLimpio1.length == textoLimpio2.length){
        res = true
        textoLimpio1.forEach { caracter ->
            if(!texto2.contains(caracter, ignoreCase = true)){
                res = false
            }
        }
    }
    return res
}