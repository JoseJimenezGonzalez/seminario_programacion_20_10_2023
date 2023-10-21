package ejercicio30
//Crea una función que, dado un número entero, devuelva True si es un número triangular
//(puede representarse como un triángulo equilátero de puntos), o False en caso contrario.
fun main(){
    val numeroPrueba1 = 20 //No es triangular
    val numeroPrueba2 = 21 //Si es triangular
    println("¿El numero $numeroPrueba1 es triangular? ${isTriangular(numeroPrueba1)}")
    println("¿El numero $numeroPrueba2 es triangular? ${isTriangular(numeroPrueba2)}")
}
fun isTriangular(numero: Int): Boolean{
    val solucion = ((-1) + Math.sqrt(1 + 8 * numero.toDouble())) / 2
    return solucion.toInt().toDouble() == solucion
}

