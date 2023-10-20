package ejercicio12
//Crea una función que determine si un número dado es capicúa
fun main(){
    val numero = 7997
    println("¿El numero $numero es capicua? ${isCapicua(numero)}")
}
fun isCapicua(numero: Int): Boolean = numero.toString().toList() == numero.toString().toList().asReversed()