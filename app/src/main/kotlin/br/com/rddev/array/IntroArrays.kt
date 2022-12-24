package br.com.rddev.array

fun main() {
    val nomes: Array<String> = Array<String>(3) { "" }
    nomes[0] = "Roberto"
    nomes[1] = "Ana"
    nomes[2] = "Paula"

    val contatos = arrayOf("Roberto", "Ana", "Paula")

    val idades: IntArray = intArrayOf(25,19,33,20,55,40)

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade =  idade
        }
    }
    println(menorIdade)

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    var indice = 0
    for (salario in salarios) {
        salarios[indice] = salario * aumento
        indice++
    }
    println(salarios.contentToString())

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.contentToString())

}