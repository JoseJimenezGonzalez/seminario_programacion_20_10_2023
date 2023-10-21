package ejercicio17
//Crea una función que dada una lista de números, devuelva una nueva
//lista con solo los números pares.
fun main(){
    val lista = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println("Lista inicial")
    println(lista)
    println("Lista numeros pares")
    val listaNumerosPares = listaNumerosPares(lista)
    if(listaNumerosPares.isEmpty()){
        println("No hay numeros pares en esa lista")
    }else{
        println("${listaNumerosPares(lista)}")
    }
}
fun listaNumerosPares(lista: List<Int>): MutableList<Int>{
    val listaPares: MutableList<Int> = mutableListOf()
    lista.forEach { numero ->
        if(numero % 2 == 0){
            listaPares.add(numero)
        }
    }
    return listaPares
}