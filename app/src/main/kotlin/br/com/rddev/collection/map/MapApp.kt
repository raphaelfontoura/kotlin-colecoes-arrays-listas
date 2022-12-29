package br.com.rddev.collection.map

fun main() {

    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 40.0)
    )
    println(pedidos)
//    val pedidosMapeados = pedidos.associate { pedido: Pedido ->
//        Pair(pedido.numero, pedido) // pedido.numero to pedido
//    }
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1, 20.0)])

    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
    // retornará apenas os últimos válidos, uma vez que só é possível duas chaves (true e false)
    println(mapa)

    val mapaFreteGratis = pedidos.groupBy { pedido -> pedido.valor > 50.0 }
    println(mapaFreteGratis)
    println(mapaFreteGratis[true])
    println(pedidos.groupingBy { pedido -> pedido.valor > 50.0 }.eachCount())

    val nomes = listOf("Alex", "Fran", "Gui", "Ana", "Paulo", "Maria", "Mario", "Gisele", "Marcos")
    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
    println(agenda['M'])

    println(nomes.groupingBy { nome -> nome.first() }.eachCount())

}

data class Pedido(val numero:Int, val valor: Double)