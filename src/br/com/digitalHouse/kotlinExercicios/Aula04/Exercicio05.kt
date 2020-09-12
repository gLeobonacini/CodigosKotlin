package br.com.digitalHouse.kotlinExercicios.aula04

fun main(){
    println(exercicio05(1,2,3,4))
}

fun exercicio05(numA: Int, numB: Int, numC: Int, numD: Int): Boolean{
    return numA > numC && numA > numD || numB > numC && numB > numD
}