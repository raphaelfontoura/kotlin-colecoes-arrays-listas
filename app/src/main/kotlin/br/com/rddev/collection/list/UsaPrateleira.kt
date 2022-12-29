package br.com.rddev.collection.list

fun main() {
    val prateleira =  PrateleiraMutable(genero = "Literatura", livros = listaDeLivros)

    prateleira.organizarPorAutor().imprimeComMarcadores()

    prateleira.organizarPorAnoPublicacao().imprimeComMarcadores()

    val prateleiraList = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val organizarPorAutor = prateleiraList.organizarPorAutor()
    val organizarPorAnoPublicacao = prateleiraList.organizarPorAnoPublicacao()
    organizarPorAutor.imprimeComMarcadores()
    organizarPorAnoPublicacao.imprimeComMarcadores()


}