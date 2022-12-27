package br.com.rddev.list

fun main() {

    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora: String?, livros: List<Livro>) ->
           println("$editora: ${livros.joinToString { it.titulo }}")
        }
}