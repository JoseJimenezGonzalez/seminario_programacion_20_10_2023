package ejercicio8
//Crea una función que sume los dígitos de un número. Ejemplo: sumaDigitos(245) = 2 + 4 + 5 = 11
fun main(){
    val numero = 234
    println("La suma de los digitos del numero $numero es igual a ${sumarDigitos(numero)}")
}
fun sumarDigitos(numero: Int): Int = numero.toString().toList().fold(0){ acumulador, elemento -> acumulador + (elemento - '0') }
