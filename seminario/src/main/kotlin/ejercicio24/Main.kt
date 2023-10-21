package ejercicio24
//Crea una función que encuentre el número más grande en una matriz bidimensional
fun main() {
    val matriz = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )
    val maximo = encontrarMayorMatriz(matriz)
    if (maximo != null) {
        println("El número más grande en la matriz es: $maximo")
    } else {
        println("La matriz está vacía o no tiene elementos.")
    }
}

fun encontrarMayorMatriz(matriz: List<List<Int>>): Int? {
    if (matriz.isEmpty() || matriz[0].isEmpty()) {
        return null
    }
    var maximo = matriz[0][0]
    for (fila in matriz) {
        for (elemento in fila) {
            if (elemento > maximo) {
                maximo = elemento
            }
        }
    }
    return maximo
}

