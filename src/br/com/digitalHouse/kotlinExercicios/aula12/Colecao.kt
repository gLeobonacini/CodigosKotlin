package br.com.digitalHouse.kotlinExercicios.aula12

data class Colecao (override var codigo: Int,
                    val listaDeLivros: List<Livro>,
                    val descricao: String,
                    override var preco: Double): IProduto {
}