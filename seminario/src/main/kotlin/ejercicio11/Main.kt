package ejercicio11
//Se dice que dos números son relativamente primos si su factor común más grande ( FCG ) es 1.
//Ejemplo 1: Los factores de 20 son 1, 2, 4, 5, 10 y 20. Los factores de 33 son 1, 3, 11, y 33.
fun main(){
    val numero1 = 20
    val numero2 = 33
    val numero3 = 40
    val numero4 = 0
    println("¿$numero1 y $numero2 son primos relativos? ${esPrimorelativo(calcularDivisores(numero1), calcularDivisores(numero2))}")
    println("¿$numero1 y $numero3 son primos relativos? ${esPrimorelativo(calcularDivisores(numero1), calcularDivisores(numero3))}")
    println("¿$numero1 y $numero4 son primos relativos? ${esPrimorelativo(calcularDivisores(numero1), calcularDivisores(numero4))}")
}
fun esPrimorelativo(lista1: MutableList<Int>, lista2: MutableList<Int>): Boolean{
    var contador = 0
    lista1.forEach{ elemento ->
        if(elemento in lista2){
            contador++
        }
    }
    return contador == 1
}

fun calcularDivisores(numero: Int): MutableList<Int>{
    val divisores = mutableListOf<Int>()
    for(i in 1..numero){
        if(numero % i == 0){
            divisores.add(i)
        }
    }
    return divisores
}

