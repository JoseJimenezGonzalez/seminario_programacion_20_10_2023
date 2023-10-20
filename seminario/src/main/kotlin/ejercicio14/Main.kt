package ejercicio14

fun main(){
    val alturaMosaico = 6
    println(imprimirMosaico(alturaMosaico))
}
fun imprimirMosaico(altura: Int): String{
    var dibujoFigura = ""
    for (i in 1..altura){
        for(j in 1..i){
            dibujoFigura += i
        }
        dibujoFigura += "\n"
    }
    return dibujoFigura
}