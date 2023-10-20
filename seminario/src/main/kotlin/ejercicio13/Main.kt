package ejercicio13

fun emmetAHtml(emmet: String): String {
    val elementos = emmet.split(".")
    val tagNombre = elementos[0].split("#")
    val tag = tagNombre[0]
    val id = if (tagNombre.size > 1) "id=\"${tagNombre[1]}\"" else ""
    val classes = if (elementos.size > 1) "class=\"${elementos.subList(1, elementos.size).joinToString(" ")}\"" else ""

    val atributos = listOf(id, classes).filter { it.isNotBlank() }.joinToString(" ")

    return if (atributos.isNotBlank()) {
        "<$tag $atributos></$tag>"
    } else {
        "<$tag></$tag>"
    }
}

fun main() {
    println(emmetAHtml("a"))
    println(emmetAHtml("div.oferta"))
    println(emmetAHtml("div.coche#VWPolo"))
}