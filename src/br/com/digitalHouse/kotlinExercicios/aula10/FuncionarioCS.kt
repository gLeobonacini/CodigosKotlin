package br.com.digitalHouse.kotlinExercicios.aula10

data class FuncionarioCS(val nome: String, val numeroDeRegistro: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is FuncionarioCS)
            return false
        return this.numeroDeRegistro == other.numeroDeRegistro
    }
}