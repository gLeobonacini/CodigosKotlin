package br.com.digitalHouse.kotlinExercicios.aula05

import java.util.*
import kotlin.collections.ArrayList

fun main(){
    // Exercício 01 - Lista 1
    val num = matematicaL1(7);
    num.fatorial()

    // Exercício 02 - Lista 1
    val p1 = aposentadoria(59,"Feminino",30)
    println("P1 pode aposentar? ${p1.permitirAposentar()}")
    val p2 = aposentadoria(65,"Masculino",29)
    println("P2 pode aposentar? ${p2.permitirAposentar()}")
    val p3 = aposentadoria(60,"Feminino",30)
    println("P3 pode aposentar? ${p3.permitirAposentar()}")
    val p4 = aposentadoria(65,"Masculino",30)
    println("P4 pode aposentar? ${p4.permitirAposentar()}")

    // Exercício 03 - Lista 1
    val v = vetorCalculo(ArrayList<Int>(Arrays.asList(1,4,7)))
    v.multiplicacao()

    // Exercício 01 - Lista 2
    val Ex01 = Exercicio01()
    Ex01.main()

    // Exercício 02 - Lista 2
    val Ex02 = Exercicio02()
    Ex02.main()

    // Exercício 03 - Lista 2
    val Ex03 = Exercicio03()
    Ex03.main()

    // Exercício 04 - Lista 2
    val Ex04 = Exercicio04()
    Ex04.main()

    // Exercício 05 - Lista 2
    val Ex05 = Exercicio05()
    Ex05.main()
}