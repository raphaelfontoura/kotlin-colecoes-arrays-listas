package br.com.rddev.list

import br.com.rddev.collection.testaCopia

fun main() {

    val assistiramCursoAndroid = listOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf("Alex", "Paulo", "Maria")

    val assistiramAmbos = mutableListOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos)

    val assistiramAmbosSum = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramAmbosSum.distinct())

}



