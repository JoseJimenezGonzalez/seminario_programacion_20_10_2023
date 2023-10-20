package ejercicio22
//Crea una función que, dado un número, devuelva True si es un número perfecto (la suma de
//sus divisores propios positivos es igual al número), o False en caso contrario.

fun main(){
    val numero = 28
    println("¿El $numero es un numero perfecto? ${esNumeroPerfecto(numero)}")
}
fun esNumeroPerfecto(numero: Int): Boolean{
    var res = false
    var listaDivisores = mutableListOf<Int>()
    for (i in 1..<numero){
        if(numero % i == 0){
            listaDivisores.add(i)
        }
    }
    val sumatoria = listaDivisores.fold(0){ acumulador, num -> acumulador + num }
    if(numero == sumatoria){
        res = true
    }
    return res

}
