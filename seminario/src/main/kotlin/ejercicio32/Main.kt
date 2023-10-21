package ejercicio32
//Crear un Diccionario a partir de Listas
//Escribe una función que tome dos listas, una lista de claves y otra lista de valores, y
//cree un diccionario utilizando mapOf para combinar las listas en un diccionario
//clave-valor. La función debe devolver el diccionario resultante.
fun main(){
    val listaClave = listOf<Int>(1 ,2, 3)
    val listaValor = listOf<String>("Uno", "Dos", "Tres")
    val mapa = fabricarDiccionario(listaClave, listaValor)
    println(mapa.keys)
    println(mapa.values)
    println("La clave 1 está asociada con el valor ${mapa.get(1)}")
}

fun fabricarDiccionario(listaClave: List<Int>, listaValor: List<String>): Map<Int, String> {
    val map = mutableMapOf<Int, String>()
    for (i in listaClave.indices) {
        map[listaClave[i]] = listaValor[i]
    }
    return map
}