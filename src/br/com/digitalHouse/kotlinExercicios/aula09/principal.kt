package br.com.digitalHouse.kotlinExercicios.aula09

fun main() {
    // ListOf
    //val estados1 = listOf ("São Paulo", "Pará", "Rio de Janeiro")
    //println("O número de elementos da lista é: ${estados1.size}")
    //println("Pegando o terceiro elemento da lista é: ${estados1.get(2)}")
    //println("Index do Pará é: ${estados1.indexOf("Pará")}")

    // MutableListOf
    //val estados2 = mutableListOf("Paraná", "Bahia", "Goiás")
    //estados2.add("Amazonas")
    //estados2[0] = "São Paulo"
    //println(estados2)

    // SetOf
    //val estados3 = setOf("Paraná", "São Paulo", "Brasília", "Mato Grosso")
    //println("O número de elementos da lista é: ${estados3.size}")
    //if(estados3.contains("Paraná")) println("Paraná está no conjunto")
    //val estados3Decrescente = setOf("Mato Grosso", "Brasília", "São Paulo", "Paraná")
    //println("Os sets são iguais: ${estados3 == estados3Decrescente}")

    // MutableSetOf
    //val estados4 = mutableSetOf<String>()
    //estados4.add("SP")
    //estados4.add("RJ")
    //estados4.add("MG")
    //println(estados4)

    // MapOf
    //val numeros1 = mapOf("one" to 1, "two" to 2, "three" to 3)
    //println("Chaves = ${numeros1.keys}")
    //println("Valores = ${numeros1.values}")
    //if("two" in numeros1) println("O valor da chave two: ${numeros1["two"]}")

    // MutableMapOf
    //val numeros2 = mutableMapOf("one" to 1, "two" to 2)
    //println(numeros2)
    //numeros2.put("three", 3)
    //numeros2["one"] = 21
    //println(numeros2)

    //val loteria = Loteria()
    //val apelidos = Apelidos()
    //val ex01 = Exercicio01()
    //ex01.main(loteria,apelidos)

    //val lista = Lista()
    //val conjunto = Conjunto()
    //val ex02 = Exercicio02()
    //ex02.main(lista,conjunto)

    //val nota = setOf(1,2,3,4,5,6,7,8,9)
    //val ex03 = Exercicio03()
    //val prova = Prova()
    //ex03.main(nota)
    //prova.somaTotal(nota)

    val guardaVolumeSaveTheClothes = GuardaVolume()
    val camiseta = Peca("Camiseta","Social")
    val calca = Peca("Calça","Social")
    val listaRoupas = listOf(camiseta,calca)
    val idClothes = guardaVolumeSaveTheClothes.guardarPecas(listaRoupas)
    guardaVolumeSaveTheClothes.imprimirPecasTela()
    guardaVolumeSaveTheClothes.mostrarPecas(idClothes)
    guardaVolumeSaveTheClothes.devolverPecas(idClothes)

}