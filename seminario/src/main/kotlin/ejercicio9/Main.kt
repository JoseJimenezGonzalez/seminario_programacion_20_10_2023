package ejercicio9
//Crea una función que calcule el máximo común divisor de dos números naturales
fun main(){
    val numero1 = 20
    val numero2 = 6
    println("El MCD de $numero1 y $numero2 es ${calcularMCD(numero1, numero2)}")
}
fun calcularMCD(numero1: Int, numero2: Int): Int{
    var numeroMayor = numero1
    var numeroMenor = numero2
    if(numero1<numero2){
        numeroMayor = numero2
        numeroMenor = numero1
    }
    while(numeroMenor != 0){
        val residuo = numeroMayor % numeroMenor
        numeroMayor = numeroMenor
        numeroMenor = residuo
    }
    return numeroMayor
}
