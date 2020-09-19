package br.com.digitalHouse.kotlinExercicios.aula10

fun main() {
    //var notebook1 = Notebook("Dell", 3500.00)
    //println(notebook1)
    //var notebook2 = Notebook("Positivo", 2800.00)
    //println(notebook1.equals(notebook2))

    //var copyNotebook2 = notebook2.copy(preco = 4000.00)
    //println(copyNotebook2)

    // Exercício 01 - Finalizado
    val p1 = PessoaSS("Joana",1234567)
    val p2 = PessoaSS("Maria",1234567)
    val p3 = PessoaCS("Joana",1234567)
    val p4 = PessoaCS("Maria",1234567)

    println("Sem sobrescrita, p1 e p2 são iguais? \n \t ${p1.equals(p2)}")
    println("Com sobrescrita, p1 e p2 tem o mesmo RG? \n \t ${p3.equals(p4)}")

    // Exercício 02 - Finalizado
    val c1 = CocaSS(600,11.00)
    val c2 = CocaSS(600,10.00)
    val c3 = CocaCS(600,11.00)
    val c4 = CocaCS(600,10.00)

    println("Sem sobrescrita, c1 e c2 são iguais? \n \t ${c1.equals(c2)}")
    println("Com sobrescrita, c1 e c2 são do mesmo tamanho? \n \t ${c3.equals(c4)}")

    // Exercício 03
    val listaDeAlunosSS = mutableListOf<AlunoSS>()
    val a1 = AlunoSS("Arthur",10)
    val a2 = AlunoSS("Leonardo B",11)
    val a3 = AlunoSS("Leonardo C",12)
    val a4 = AlunoSS("Matheus",13)

    listaDeAlunosSS.add(a1)
    listaDeAlunosSS.add(a2)
    listaDeAlunosSS.add(a3)
    listaDeAlunosSS.add(a4)

    val a5 = AlunoSS("Thais",10)

    println("O aluno $a5 está na lista? \n \t ${listaDeAlunosSS.contains(a5)}")

    val listaDeAlunosCS = mutableListOf<AlunoCS>()
    val a6 = AlunoCS("Arthur",10)
    val a7 = AlunoCS("Leonardo B",11)
    val a8 = AlunoCS("Leonardo C",12)
    val a9 = AlunoCS("Matheus",13)

    listaDeAlunosCS.add(a6)
    listaDeAlunosCS.add(a7)
    listaDeAlunosCS.add(a8)
    listaDeAlunosCS.add(a9)

    val a10 = AlunoCS("Thais",10)

    println("O aluno $a5 está na lista? \n \t ${listaDeAlunosCS.contains(a10)}")

    // Exercício 04
    val listaDeFuncionariosSS = mutableListOf<FuncionarioSS>()
    val f1 = FuncionarioSS("Arthur",10)
    val f2 = FuncionarioSS("Leonardo B",11)
    val f3 = FuncionarioSS("Leonardo C",12)
    val f4 = FuncionarioSS("Matheus",13)

    listaDeFuncionariosSS.add(f1)
    listaDeFuncionariosSS.add(f2)
    listaDeFuncionariosSS.add(f3)
    listaDeFuncionariosSS.add(f4)

    val f5 = FuncionarioSS("Thais",10)

    println("O funcionário $f5 está na lista? \n \t ${listaDeFuncionariosSS.contains(f5)}")

    val listaDeFuncionariosCS = mutableListOf<FuncionarioCS>()
    val f6 = FuncionarioCS("Arthur",10)
    val f7 = FuncionarioCS("Leonardo B",11)
    val f8 = FuncionarioCS("Leonardo C",12)
    val f9 = FuncionarioCS("Matheus",13)

    listaDeFuncionariosCS.add(f6)
    listaDeFuncionariosCS.add(f7)
    listaDeFuncionariosCS.add(f8)
    listaDeFuncionariosCS.add(f9)

    val f10 = FuncionarioCS("Thais",10)

    println("O Funcionário $f5 está na lista? \n \t ${listaDeFuncionariosCS.contains(f10)}")
}
