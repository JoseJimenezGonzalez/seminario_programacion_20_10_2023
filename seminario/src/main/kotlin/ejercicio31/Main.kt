package ejercicio31
//Escribe una función que tome una lista de números y utilice la función map para
//duplicar cada número en la lista. La función debe devolver una nueva lista con
//todos los números duplicados.
//Por ejemplo, si la entrada es [1, 2, 3, 4], la función debe devolver [2, 4, 6, 8].
fun main(){
    val lista: List<Int> = listOf(1, 2, 3, 4)
    println("Lista inicial")
    println(lista)
    println("Lista con los numeros duplicados")
    println(duplicarElementos(lista))
}
fun duplicarElementos(lista: List<Int>): List<Int> = lista.map { elemento -> 2 * elemento }
