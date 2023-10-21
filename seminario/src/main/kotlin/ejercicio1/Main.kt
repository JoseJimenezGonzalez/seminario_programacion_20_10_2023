package ejercicio1
//Crea una función que obtenga el numero mas grande de una lista de números
fun main(){
    val lista = listOf(1, 2, 3, 4, 5, 100, 120, -90)
    println(maximo(lista))
}
fun maximo(lista: List<Int>): Int{
    var maximo = lista[0]
    lista.forEach {numero ->
        if (maximo<numero){
            maximo = numero
        }
    }
    return maximo
}