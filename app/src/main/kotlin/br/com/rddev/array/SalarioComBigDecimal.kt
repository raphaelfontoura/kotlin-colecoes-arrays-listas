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
    println("Gasto total sem aumento ${arrayOfSalarios.somatoria()}")

    val aumento = "1.1".toBigDecimal()
    val salariosReajustados = arrayOfSalarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println(salariosReajustados.contentToString())

    println("soma de um array de inteiros ${intArrayOf(1,2,3).sum()}")
    val gastoInicial = salariosReajustados.somatoria()
    println("Gasto total com aumento $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosReajustados.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }

    println("Gasto total após 6 meses $gastoTotal")

    val salariosOrdenados = salariosReajustados.sorted()
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
    val media = tresUltimosSalarios.media()

    println("Média 3 maiores: $media")

    val mediaOneLine = salariosReajustados.sorted().takeLast(3).toTypedArray().media()
    println("Média 3 maiores (uma linha): $mediaOneLine")

    val media3Primeiros = salariosReajustados.sorted().take(3).toTypedArray().media()
    println("Média 3 menores: $media3Primeiros")

}

private fun calculaAumentoRelativo(
    salario: BigDecimal,
    aumento: BigDecimal
) = if (salario < "5000".toBigDecimal()) {
    salario + "500".toBigDecimal()
} else {
    (salario * aumento).setScale(2, RoundingMode.UP)
}


