package br.com.rddev.list

data class PrateleiraMutable (
    val genero: String,
    val livros: MutableList<Livro> //Mutable List é Mutável.
) {
    fun organizarPorAutor() : MutableList<Livro> {
        livros.sortBy { it.autor }
        return livros
    }

    fun organizarPorAnoPublicacao() : MutableList<Livro> {
        livros.sortBy { it.anoPublicacao }
        return livros
    }
}