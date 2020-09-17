package br.com.digitalHouse.kotlinExercicios.aula09

class Lista {
    val lista = mutableListOf<Int>()
    init{
        lista.add(1)
        lista.add(5)
        lista.add(5)
        lista.add(6)
        lista.add(7)
        lista.add(8)
        lista.add(8)
        lista.add(8)
        print("A lista é: ")
        println(lista)
    }
}