package ejercicio10
//Crea una función que calcule el término n-ésimo de la sucesión de Finbonacci
fun main(){
    val terminoSucesion = 13 //144
    println("El termino $terminoSucesion en la serie de Fibonacci es ${calcularNEsimoTerminoFibo(terminoSucesion)}")
}

fun calcularNEsimoTerminoFibo(numero: Int): Int{
    val sucesionFibo = mutableListOf(0, 1)
    for(i in 2 until numero){
        sucesionFibo.add(sucesionFibo[i-2] + sucesionFibo[i-1])
    }
    return sucesionFibo[numero - 1]
}