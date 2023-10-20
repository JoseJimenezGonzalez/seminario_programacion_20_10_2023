package ejercicio26
//Crea una función que, dada una lista de palabras, devuelva la palabra más larga.
fun main(){
    val listaPalabras = listOf<String>("Hola", "Programacion", "Variable", "Si")
    println("La palabra mas grande es: ${ palabraMasGrande(listaPalabras) }")
}
fun palabraMasGrande(list: List<String>): String{
    var indicePalabraMasLarga = 0
    var longitudPalabraMasLarga = list[indicePalabraMasLarga].length

    list.forEachIndexed { indice, palabra ->
        if(palabra.length > longitudPalabraMasLarga){
            longitudPalabraMasLarga = list[indice].length
            indicePalabraMasLarga = indice
        }
    }
    return list[indicePalabraMasLarga]
}