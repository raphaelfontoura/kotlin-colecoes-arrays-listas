package br.com.rddev.array

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = Array<BigDecimal>(5) { BigDecimal.ZERO }
    salarios[0] = "1500.55".toBigDecimal()
    salarios[1] = "2000.00".toBigDecimal()

    println(salarios.contentToString())

    val arrayOfSalarios = bigDecimalArrayOf("1500.30", "2000.00", "3780.55", "5000", "10000")
    println(arrayOfSalarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosReajustados = arrayOfSalarios
        .map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal()
            } else {
                (salario * aumento).setScale(2, RoundingMode.UP)
            }
        }
        .toTypedArray()
    println(salariosReajustados.contentToString())
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    // O “vararg” é um tipo especial do Kotlin que você consegue passar mais de um valor para a função
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}