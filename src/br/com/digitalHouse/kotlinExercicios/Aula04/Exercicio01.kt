package br.com.digitalHouse.kotlinExercicios.aula04

fun main(){
    println(exercicio01(1,2,3))
}

fun exercicio01(num1: Int, num2: Int, num3: Int): Int{
    if(num1 >= num2 && num1 >= num3)
        return num1
    else if(num2 >= num1 && num2 >= num3)
        return num2
    else
        return num3
}