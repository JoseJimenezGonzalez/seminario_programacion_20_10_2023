package ejercicio21

fun main(){
    val palabra = "Hola soy jose"
    println("${invertirCadenaTexto(palabra)}")
}
fun invertirCadenaTexto(texto: String): String{
    var cadenaInvertida = ""
    for (i in texto.length downTo 1){
        cadenaInvertida += texto[i-1]
    }
    return cadenaInvertida
}