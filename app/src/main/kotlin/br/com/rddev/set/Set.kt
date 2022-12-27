package br.com.rddev.set

fun main() {
    val assistiramCursoAndroid = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin

    println(assistiramAmbos)
//    println(assistiramAmbos[0])

    val assistiramCursoAndroid2 = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin2 = listOf("Alex", "Paulo", "Maria")

    val assistiramAmbos2 = mutableSetOf<String>()
    assistiramAmbos2.addAll(assistiramCursoAndroid2)
    assistiramAmbos2.addAll(assistiramCursoKotlin2)
    assistiramAmbos2.add("Gui")
    assistiramAmbos2.add("Ana")

    println(assistiramAmbos2)

}