package br.com.digitalHouse.kotlinExercicios.Aula06

open class VIP(): Ingresso() {

    val valorAdicional: Double = 50.00

    fun retornarValor(): Double{
        return valor + valorAdicional
    }

    override fun imprimeValor() {

    }
}