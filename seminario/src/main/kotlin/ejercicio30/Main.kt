package ejercicio30
//Crea una función que, dado un número entero, devuelva True si es un número triangular
//(puede representarse como un triángulo equilátero de puntos), o False en caso contrario.
fun main(){
    val numeroPrueba = 21
    println("¿El numero $numeroPrueba es triangular? ${isTriangular(numeroPrueba)}")
}
fun isTriangular(numero: Int): Boolean{
    var numeroSerie = 0
    var chivato = 0
    var res = false
    while(chivato < numero){
        chivato = numeroSerie*(numeroSerie + 1)/2
        if(chivato == numero){
            res = true
        }
        numeroSerie++
    }
    return res
}
