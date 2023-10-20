package ejercicio5
//Crea una función que cuenta cuántas veces aparece una letra en un texto
fun main(){
    val texto = "Hoy es miercoles"
    val letra = 'o'
    println("La letra $letra aparece ${numeroVecesLetra(texto, letra)} veces")
    //Con la otra funcion
    println("La letra $letra aparece ${optimizado(texto, letra)} veces")
}
fun numeroVecesLetra(texto: String, letra: Char): Int{
    var contador = 0
    texto.forEach { caracter ->
        if(letra == caracter){
            contador++
        }
    }
    return contador
}

fun optimizado (texto: String, letra: Char): Int = texto.count { elemento -> elemento == letra }