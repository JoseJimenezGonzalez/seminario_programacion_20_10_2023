package ejercicio33

//Crea un programa se encargue de transformar un número decimal a
//binario sin utilizar funciones propias del lenguaje que lo hagan directamente.
fun main(){
    val numeroDecimal = 9
    println("El numero decimal $numeroDecimal en binario es ${transformarDecimalABinario(numeroDecimal)}")
}
fun transformarDecimalABinario(numero: Int): Int{
    if(numero == 0){
        return 0
    }else if(numero == 1){
        return 1
    }else{
        var listaBinario: MutableList<Int> = mutableListOf()
        val divisor = 2
        var numeroDecimal = numero
        var condicion = true
        while(condicion){
            val resto = numeroDecimal % divisor
            val cociente = numeroDecimal / divisor
            numeroDecimal = cociente
            listaBinario.add(resto)
            if(cociente == 1){
                condicion = false
                listaBinario.add(cociente)
            }
        }
        val numeroTextoBinario = listaBinario.reversed().toString()
        val textoLimpio = numeroTextoBinario.replace(Regex("[^0-9]"), "")
        val numeroBinario = textoLimpio.toInt()
        return numeroBinario
    }
}