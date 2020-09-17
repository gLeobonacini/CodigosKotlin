package br.com.digitalHouse.kotlinExercicios.aula09

class Conjunto {
    val conjunto = mutableSetOf<Int>()
    init{
        conjunto.add(1)
        conjunto.add(5)
        conjunto.add(5)
        conjunto.add(6)
        conjunto.add(7)
        conjunto.add(8)
        conjunto.add(8)
        conjunto.add(8)
        print("O conjunto é: ")
        println(conjunto)
    }
}