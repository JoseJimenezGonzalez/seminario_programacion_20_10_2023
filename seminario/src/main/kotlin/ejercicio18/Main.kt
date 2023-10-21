package ejercicio18
//Crea una función que determine si un número es primo.
fun main(){
    val numero = 15
    println("¿El numero $numero es primo? ${esPrimo(numero)}")
}
fun esPrimo(numero: Int): Boolean {
    var res = true
    if (numero <= 1) {
        res = false
    }
    for (i in 2 until numero) {
        if (numero % i == 0) {
            res = false
        }
    }
    return res
}