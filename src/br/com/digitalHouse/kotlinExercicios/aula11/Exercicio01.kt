package br.com.digitalHouse.kotlinExercicios.aula11

fun main(){
    val lista = arrayListOf<String>()
    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")
    //println("Imprimir posição 3: ${lista.get(3)}")

    try{
        println("Imprimir posição 3: ${lista.get(3)}")
    } catch (ex: Exception){
        println("Ocorreu uma execução: ${ex.message}")
        ex.stackTrace
    }
}