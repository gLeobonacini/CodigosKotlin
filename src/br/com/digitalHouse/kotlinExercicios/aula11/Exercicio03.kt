package br.com.digitalHouse.kotlinExercicios.aula11

fun main(){
    val x = 2
    val y = 1
    val z = 0

    try{
        println("O valor é ${x*y/z}")
    } catch (ex: Exception){
        println("Ocorreu uma execução: ${ex.message}")
        ex.stackTrace
    }
}

