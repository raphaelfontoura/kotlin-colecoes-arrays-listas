package br.com.rddev.collection

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos = banco.nomes // as MutableCollection // cannot be cast to kotlin.collections.MutableCollection

    banco.salva("Alex")
//    nomesSalvos.add("Paulo")

    println(banco.nomes)

    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = listOf("Alex", "Fran", "Gui", "Maria", "Ana")

    for (nome in nomes) { // nomes.iterator()
        println(nome)
    }
    println(nomes)

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")

    val nomesMutable: MutableCollection<String> = mutableListOf("Alex", "Fran", "Gui", "Maria", "Ana")
    for (nome in nomes) {
        println(nome)
    }
    nomesMutable.add("Paulo")
    println(nomesMutable)
}