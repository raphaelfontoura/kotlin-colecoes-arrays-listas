package br.com.rddev.set

fun main() {

    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0)
    // o infix <to> deve ser evitado caso o map seja grande -> questão de performance
    println(pedidos)

    val pedido0 = pedidos[0]
    pedido0?.let {
        println("pedido $it")
    }

    val pedido1 = pedidos[1]
    pedido1?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }
}

