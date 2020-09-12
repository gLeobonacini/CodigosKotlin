package br.com.digitalHouse.kotlinExercicios.aula04

fun main(){
    exercicio04()
}

fun exercicio04(){
    var count = 0
    var somador = 0
    while (count < 100){
        if (somador % 2 == 1) {
            println(somador)
            count++
        }
        somador++
    }
}