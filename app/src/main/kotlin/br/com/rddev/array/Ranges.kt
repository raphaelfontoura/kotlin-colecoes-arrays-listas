package br.com.rddev.array

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }
    println()

    val numerosPares = 0..100 step 2 // incluindo o 100
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()

    val numerosAte = 0.until(100) step 2 // não inclui o 100.
    for (i in numerosAte) {
        print("$i ")
    }
    println()

    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }
    println()

    val intervalo = 1500.0..5000.0
    val salario = 5050.10
    if (salario in intervalo) {
        println("o salário $salario está dentro do intervalo.")
    } else {
        println("o salário $salario não está dentro do intervalo.")
    }

    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)

}