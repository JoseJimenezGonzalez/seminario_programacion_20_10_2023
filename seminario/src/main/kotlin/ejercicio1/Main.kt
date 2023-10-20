package ejercicio1
//Crea una función que obtenga el numero mas grande de una lista de números
fun main(){
    val lista = listOf(1, 2, 3, 4, 5, 100, 120, -90)
    println(maximo1(lista))
    println(maximo2(lista))
}
fun maximo1(lista: List<Int>) :Int{
    val ordenada = lista.sortedByDescending { numero -> numero }
    println(ordenada)
    return ordenada[0]
}

fun maximo2(lista: List<Int>): Int{
    var maximo = lista[0]
    lista.forEach {numero ->
        if (maximo<numero){
            maximo = numero
        }
    }
    return maximo
}