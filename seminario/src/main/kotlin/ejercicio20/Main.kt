package ejercicio20

fun main(){
    val numero = 5
    println("El factorial del numero $numero es ${factorial(numero)}")
}
fun factorial(numero: Int): Int{
    var factorial = 1
    for (i in 2..numero){
        factorial*=i
    }
    return factorial
}