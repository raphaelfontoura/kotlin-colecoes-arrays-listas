package br.com.rddev.collection.list

fun main() {

    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
           println("$editora: ${livros.joinToString { it.titulo }}")
        }
}