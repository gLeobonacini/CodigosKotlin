package br.com.digitalHouse.kotlinExercicios.aula10

data class PessoaCS (val nome: String, val RG: Long) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is PessoaCS)
            return false
        return this.RG == other.RG
    }
}