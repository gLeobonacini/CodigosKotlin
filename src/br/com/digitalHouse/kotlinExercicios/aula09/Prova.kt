package br.com.digitalHouse.kotlinExercicios.aula09

class Prova {
    fun somaTotal(conjuntoDeInteiros: Set<Int>){
        var soma: Int = 0
        conjuntoDeInteiros.forEach(){
            soma += it
        }
        println("O valor da soma é: $soma")
    }
}