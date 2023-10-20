package ejercicio16
//Crea una función que calcule el producto de todos los elementos en
//una lista de números.
fun main(){
    val lista: List<Int> = listOf(2, 3, 4)
    println("El producto de todos los elementos de la lista es ${productoNumerosLista(lista)}")
}
fun productoNumerosLista(lista: List<Int>): Int = lista.fold(1){ acumulador, numero -> acumulador * numero }

