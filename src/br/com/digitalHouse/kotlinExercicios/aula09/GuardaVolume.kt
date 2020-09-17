package br.com.digitalHouse.kotlinExercicios.aula09

class GuardaVolume() {

    private val listaDePecas = mutableMapOf<Int,List<Peca>>()
    private var contador: Int = 0

    fun guardarPecas(itensGuardados: List<Peca>): Int{
        contador ++
        listaDePecas.put(contador,itensGuardados)
        return contador
    }

    fun imprimirPecasTela(){
        listaDePecas.forEach(){
            println("Número de Identificação ${it.key}:")
            for(i in 0 .. it.value.size - 1){
                println("${it.value[i].marca} ${it.value[i].modelo}")
            }
            print("\n")
        }
    }

    fun mostrarPecas(numero: Int){
        println("Número de Identificação $numero: ")
        for(i in 0 .. listaDePecas.getValue(numero).size -1){
            println("${listaDePecas.getValue(numero)[i].marca} ${listaDePecas.getValue(numero)[i].modelo}")
        }
        print("\n")
    }

    fun devolverPecas(numero: Int){
        println("Retirando as peças: ")
        for(i in 0 .. listaDePecas.getValue(numero).size - 1){
            println("${listaDePecas.getValue(numero)[i].marca} ${listaDePecas.getValue(numero)[i].modelo}")
        }
        println("Do Número de Identificação $numero")
        listaDePecas.remove(numero)
        println("Retirada de peças concluída com sucesso")
    }
}
