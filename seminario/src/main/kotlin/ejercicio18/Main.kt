package ejercicio18
//Crea una función que determine si un número es primo.
fun main(){
    val numero = 15
    println("¿El numero $numero es primo? ${esPrimo(numero)}")
}
fun esPrimo(numero: Int): Boolean{
    var res = true
    var contador = numero - 1
    while(res && contador != 1 && numero != 1){
       if(numero % contador == 0){
           res = false
       }
       contador--
    }
    return res
}