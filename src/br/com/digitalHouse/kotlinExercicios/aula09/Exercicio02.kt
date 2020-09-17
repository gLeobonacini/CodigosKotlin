package br.com.digitalHouse.kotlinExercicios.aula09

class Exercicio02() {
    fun main(listaDados: Lista, conjuntoDados: Conjunto){
        listaDados.lista.forEach(){
            println ("Imprimindo a lista $it")
        }

        conjuntoDados.conjunto.forEach(){
            println ("Imprimindo o conjunto $it")
        }
    }
}