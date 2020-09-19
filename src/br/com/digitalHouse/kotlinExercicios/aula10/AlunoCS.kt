package br.com.digitalHouse.kotlinExercicios.aula10

data class AlunoCS(val nome: String, val numeroDeAluno: Int) {
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is AlunoCS)
            return false
        return this.numeroDeAluno == other.numeroDeAluno
    }
}