package ejercicio32

fun main(){
    val listaClave = listOf<Int>(1 ,2, 3)
    val listaValor = listOf<String>("Uno", "Dos", "Tres")
    var mapa = fabricarDiccionario(listaClave, listaValor)
    println(mapa.keys)
    println(mapa.values)
}

fun fabricarDiccionario(listaClave: List<Int>, listaValor: List<String>): Map<Int, String> {
    val map = mutableMapOf<Int, String>()
    for (i in listaClave.indices) {
        map[listaClave[i]] = listaValor[i]
    }
    return map
}