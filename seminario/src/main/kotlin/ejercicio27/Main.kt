package ejercicio27
//Crea una función que, dada una lista de palabras, devuelva la palabra más corta.
fun main(){
    val listaPalabras = listOf<String>("Hola", "Programacion", "Variable", "Si")
    println("La palabra mas grande es: ${ palabraMasCorta(listaPalabras) }")
}
fun palabraMasCorta(list: List<String>): String{
    var indicePalabraMasCorta = 0
    var longitudPalabraMasCorta = list[indicePalabraMasCorta].length

    list.forEachIndexed { indice, palabra ->
        if(palabra.length < longitudPalabraMasCorta){
            longitudPalabraMasCorta = list[indice].length
            indicePalabraMasCorta = indice
        }
    }
    return list[indicePalabraMasCorta]
}