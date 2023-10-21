package ejercicio14
//Crea una función que dado un número n imprima el siguiente ‘mosaico’
//(para n = 6):
//1
//22
//333
//4444
//55555
//666666
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