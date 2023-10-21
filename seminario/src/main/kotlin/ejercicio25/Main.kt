package ejercicio25
//Crea una función que encuentre el número más pequeño en una matriz bidimensional
fun main() {
    val matriz = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    val minimo = encontrarMenorMatriz(matriz)
    if (minimo != null) {
        println("El número más pequeño en la matriz es: $minimo")
    } else {
        println("La matriz está vacía o no tiene elementos.")
    }
}

fun encontrarMenorMatriz(matriz: List<List<Int>>): Int? {
    if (matriz.isEmpty() || matriz[0].isEmpty()) {
        return null
    }
    var minimo = matriz[0][0]
    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento < minimo) {
                minimo = elemento
            }
        }
    }
    return minimo
}