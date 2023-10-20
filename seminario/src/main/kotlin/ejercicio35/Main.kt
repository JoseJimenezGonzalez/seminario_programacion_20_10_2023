package ejercicio35

fun main() {
    val array: Array<Int> = arrayOf(5, 6, 1, 96, 0)
    println("Lista ordenada ascendente:")
    val listaOrdenadaAsc = ordenar(array, "Asc")
    println(listaOrdenadaAsc)

    println("Lista ordenada descendente:")
    val listaOrdenadaDesc = ordenar(array, "Desc")
    println(listaOrdenadaDesc)
}

fun ordenar(array: Array<Int>, orden: String): List<Int> {
    if (orden == "Asc") {
        return ordenarArray(array)
    } else{
        val listaAscendente = ordenarArray(array)
        return listaAscendente.reversed()
    }
}

fun ordenarArray(array: Array<Int>): List<Int> {
    var listaArray: MutableList<Int> = array.toMutableList()
    val listaOrdenada: MutableList<Int> = mutableListOf()
    while (listaArray.isNotEmpty()) {
        var menor = listaArray[0]
        var menorIndex = 0

        for (i in 1 until listaArray.size) {
            if (listaArray[i] < menor) {
                menor = listaArray[i]
                menorIndex = i
            }
        }

        listaOrdenada.add(menor)
        listaArray.removeAt(menorIndex)
    }

    return listaOrdenada
}