package ejercicio2

//Crea una función que obtenga la sumatoria de una lista de números

fun main(){
    val lista = listOf(1, 2, 3, 4, 5, 100, 120, -90)
    println("La sumatoria de la lista es ${sumatoria1(lista)}")
    println("La sumatoria de la lista es ${sumatoria2(lista)}")
}
fun sumatoria1(lista: List<Int>): Int = lista.fold(0) { acumulador, numero -> acumulador + numero }

fun sumatoria2(lista: List<Int>): Int{
    var sumatoria = 0
    lista.forEach { numero ->
        sumatoria += numero }
    return sumatoria
}