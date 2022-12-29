package br.com.rddev.collection.map

fun testaMap() {
    val pedidos = mapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
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

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("número do p: ${p.key}")
        println("valor do p: ${p.value}")
    }

    val pedidosMutable = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    // o infix <to> deve ser evitado caso o map seja grande -> questão de performance
    println(pedidos)

    val pedidosMutable0 = pedidosMutable[0]
    pedidosMutable0?.let {
        println("pedido $it")
    }

    val pedidosMutable1 = pedidosMutable[1]
    pedidosMutable1?.let {
        println("pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidosMutable) {
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }

    pedidosMutable[4] = 70.0
    pedidosMutable.put(5, 80.0)
    println(pedidosMutable)
    pedidosMutable[1] = 100.0
    println(pedidosMutable)

    pedidosMutable.putIfAbsent(6, 200.0)
    println(pedidosMutable)
    pedidosMutable.putIfAbsent(6, 300.0) // não vai alterar o valor
    println(pedidosMutable)

    pedidosMutable.remove(6)
    println(pedidosMutable)

    pedidosMutable.remove(3, 100.0) // não vai remover já que o valor não é igual ao valor existente
    println(pedidosMutable)
}