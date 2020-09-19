package br.com.digitalHouse.kotlinExercicios.aula10

data class CocaCS(val tamanho: Int, val preço: Double) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is CocaCS)
            return false
        return this.tamanho == other.tamanho
    }
}