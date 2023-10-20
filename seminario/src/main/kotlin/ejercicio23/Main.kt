package ejercicio23
//Crea una función que, dado un número entero, devuelva True si es un número Armstrong (un número que es igual a la suma
//de sus propios dígitos elevados a una potencia). Por ejemplo, 153 es un número Armstrong porque 1^3 + 5^3 + 3^3 = 153.
fun main(){
    val numero = 93084
    println("¿El numero $numero es un numero amstrong? ${isNumeroAmstrong(numero)}")
}
fun isNumeroAmstrong(numero: Int): Boolean{
    var numeroAmstrong = 0
    var exponente = 0
    var res = false
    val digitos = numero.toString().toList()
    while(numero >= numeroAmstrong && !res){
        numeroAmstrong = 0
        exponente++
        digitos.forEach { numero ->
            numeroAmstrong += Math.pow((numero - '0').toDouble(), exponente.toDouble()).toInt()
        }
        if(numero == numeroAmstrong){
            res = true
        }
    }
    return res
}