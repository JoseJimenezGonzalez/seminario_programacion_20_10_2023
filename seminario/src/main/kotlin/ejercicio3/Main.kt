package ejercicio3
//Crea una función que dada una distancia en millas calcule su correspondiente en kms
const val conversionMillasKilometros = 1.60934
fun main(){
    val millas = 3060.75
    println("$millas millas equivalen a ${millToKm(millas)} km")
}
fun millToKm(millas: Double): Double = millas * conversionMillasKilometros