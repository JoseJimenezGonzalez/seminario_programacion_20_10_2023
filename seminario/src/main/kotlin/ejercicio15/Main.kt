package ejercicio15
//Crear una función que reciba dos arrays de enteros y devuelva un array de booleanos
//que determine si los elementos, uno a uno, de ambos arrays son iguales
fun main(){
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    val array2 = intArrayOf(1, 2, 3, 9, 5)
    val arrayBooleanos = sonArraysIguales(array1, array2)
    println("${arrayBooleanos.toList()}")
}
fun sonArraysIguales(arr1: IntArray, arr2: IntArray): BooleanArray {
    if (arr1.size != arr2.size) {
        throw IllegalArgumentException("Los arrays no tienen la misma longitud")
    }
    val sonIguales = BooleanArray(arr1.size)
    for (i in arr1.indices) {
        sonIguales[i] = arr1[i] == arr2[i]
    }
    return sonIguales
}
