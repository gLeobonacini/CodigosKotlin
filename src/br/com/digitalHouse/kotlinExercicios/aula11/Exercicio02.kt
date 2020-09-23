package br.com.digitalHouse.kotlinExercicios.aula11

fun main(){
    var lista1 = arrayListOf<String?>(null)
    lista1.add("Pato")
    lista1.add("Cachorro")
    lista1.add("Gato")
    println("Imprimir posição 2: ${lista1.get(2)}")

    var lista2 = arrayListOf<String>()
    //println("Imprimir posição 5: ${lista2.get(5)}")
    try{
        println("Imprimir posição 5: ${lista2.get(5)}")
    } catch (ex: Exception){
        println("Ocorreu uma execução: ${ex.message}")
        ex.stackTrace
    }

}