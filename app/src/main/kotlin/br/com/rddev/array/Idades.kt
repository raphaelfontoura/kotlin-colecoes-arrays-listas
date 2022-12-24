package br.com.rddev.array

fun main() {
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade: Int? = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    val menorIdade = idades.minOrNull()
    println("Menor idade: $menorIdade")

    val media = idades.average()
    println("Média: $media")

    val todosMaiores18 = idades.all { it >= 18 }
    println("Todos maiores de 18? $todosMaiores18")

    val existeMaior18 = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existeMaior18")

    val maiores = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca18 = idades.find { it == 18 }
    println("busca: $busca18")

    val primeiroMaior = idades.find { it > 18}
    println("primeiro acima de 18: $primeiroMaior")

}