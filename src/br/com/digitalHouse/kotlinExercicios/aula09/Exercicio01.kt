package br.com.digitalHouse.kotlinExercicios.aula09

class Exercicio01() {
    fun main(loteria: Loteria, apelidos: Apelidos){
        loteria.numeroLoteriaSonhos.keys.forEach(){
            println ("Número da Loteria dos Sonhos $it tem significado ${loteria.numeroLoteriaSonhos[it]}")
        }

        apelidos.apelidosAmigos.keys.forEach(){
            println("Meu amigo $it tem como apelido ${apelidos.apelidosAmigos[it]}")
        }
    }
}