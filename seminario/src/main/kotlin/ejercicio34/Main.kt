package ejercicio34
//Crea una función que sea capaz de encriptar y desencriptar texto
//utilizando el algoritmo de encriptación de Karaca (debes buscar información sobre él).
//Invierte el orden de la cadena y despues cambia vocales por numeros específicos.
fun main(){
    val frase = "Hola caracola"
    println("Frase inicial")
    println(frase)
    println("Frase encriptada")
    println(encriptarKaraca(frase))
    println("Frase desencriptada")
    println(desencriptarKaraca(encriptarKaraca(frase)))

}

fun encriptarKaraca(texto: String): String{
    val lista = texto.split("")
    val listaInvertida = lista.asReversed()
    val textoInvertido = listaInvertida.joinToString("")
    val textoSustituido = textoInvertido.replace('a', '9').
                                        replace('e', '1').
                                        replace('i', '8').
                                        replace('o', '2').
                                        replace('u', '7')
    return textoSustituido
}

fun desencriptarKaraca(texto: String): String{
    val lista = texto.split("")
    val listaInvertida = lista.asReversed()
    val textoInvertido = listaInvertida.joinToString("")
    val textoSustituido = textoInvertido.replace('9', 'a').
                                        replace('1', 'e').
                                        replace('8', 'i').
                                        replace('2', 'o').
                                        replace('7', 'u')
    return textoSustituido
}