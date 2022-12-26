package br.com.rddev.array

import java.math.BigDecimal
import java.math.RoundingMode

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    // O “vararg” é um tipo especial do Kotlin que você consegue passar mais de um valor para a função
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }.setScale(2, RoundingMode.UP)
}

fun Array<BigDecimal>.media() : BigDecimal {
    return if(this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}