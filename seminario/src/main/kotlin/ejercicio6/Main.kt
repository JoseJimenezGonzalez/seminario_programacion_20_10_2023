package ejercicio6
//Crea una función que cuenta cuántas veces aparece una subcadena en un texto
import java.lang.StringBuilder

fun main(){
    val texto = "Hoy es miercoles por lo tanto mañana será jueves"
    val subtexto = "es"
    println("En el texto: $texto aparece la subcadena $subtexto ${numeroVecesSubcadena(texto, subtexto)} veces")
}
fun numeroVecesSubcadena(texto: String, subtexto: String): Int{
    val sub = texto.split(subtexto)
    return sub.size-1
}