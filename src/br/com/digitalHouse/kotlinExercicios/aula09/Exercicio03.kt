package br.com.digitalHouse.kotlinExercicios.aula09

class Exercicio03 {
    fun main(conjuntoDados: Set<Int>){
        conjuntoDados.forEach(){
            println ("Imprimindo o conjunto: $it")
        }
    }
}