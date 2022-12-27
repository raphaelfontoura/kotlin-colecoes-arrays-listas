package br.com.rddev.list

fun main() {
    val nomes: Collection<String> = listOf("Alex", "Fran", "Gui", "Maria", "Ana")

    for (nome in nomes) { // nomes.iterator()
        println(nome)
    }
    println(nomes)

    println("Tem o nome Alex? ${nomes.contains("Alex")}")
    println("Tamanho da coleção ${nomes.size}")

}