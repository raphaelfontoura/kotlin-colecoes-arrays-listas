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

fun testaComportamentosMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0
    )

    println(pedidos)
    val valorPedido = pedidos.get(0)
    println(valorPedido) // null

    val valorPedido4 = pedidos.getValue(4)
    println(valorPedido4) // null

    val valorPedidoTeste = pedidos.get(5)
    println(valorPedidoTeste) // null

//    val valorPedido5 = pedidos.getValue(5) // retorna uma exception
//    println(valorPedido5) // exception NoSuchElementException

    println(pedidos.getOrElse(5) {
        "Não tem o pedido"
    })

    val orDefault = pedidos.getOrDefault(0, -1.0)
    println(orDefault)

    println(pedidos.keys)
    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }
    println(pedidosFiltrados)

    println(pedidos.filterValues { valor -> valor > 30.0 })
    println(pedidos.filterKeys { key -> key % 2 == 0 })

    println(pedidos + Pair(7, 90.0))
    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))

    println(pedidos - 4)
    println(pedidos - listOf(2, 3))

    pedidos.putAll(setOf(7 to 90.0, 8 to 20.0, 5 to 80.0))
    println(pedidos)
    pedidos += listOf(7 to 90.0, 8 to 20.0, 5 to 90.0)

    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(90.0) // remove o map com o valor
    println(pedidos)

    pedidos -= 8
    println(pedidos)
}