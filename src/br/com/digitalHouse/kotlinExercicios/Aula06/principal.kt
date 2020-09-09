package br.com.digitalHouse.kotlinExercicios.Aula06

fun main(){
    //println("OBJETO PESSOA____________________________________________")
    //val brasileiro = Pessoa(19,"Ser humano", "João")
    //brasileiro.locomover()
    //brasileiro.idadePessoa()

    //println("OBJETO FELINO____________________________________________")
    //val pantera = Felino("Azul")
    //pantera.locomover()

    //println("OBJETO GATO______________________________________________")
    //val gato = Gato()
    //gato.gatoLocomover()

    val cliente1 = Clientes(1,"Janners","00.000.000-1","000.000.000-01")
    val conta1 = ContaPoupanca(cliente1,0.00)
    val cliente2 = Clientes(1,"Stigni","00.000.000-2","000.000.000-02")
    val conta2 = ContaCorrente(cliente2,0.00,100.00)
    val cheque = Cheque(100.00,"l10","32/16/3780")

    println("Conta Poupança----------")
    conta1.consultarSaldo()
    conta1.sacar(-1.00)
    conta1.sacar(100.00)
    conta1.depositarDinheiro(-1.00)
    conta1.depositarDinheiro(100.00)
    conta1.consultarSaldo()

    println("Conta Corrente----------")
    conta2.consultarSaldo()
    conta2.sacar(-1.00)
    conta2.sacar(104.00)
    conta2.depositarDinheiro(-1.00)
    conta2.depositarDinheiro(100.00)
    conta2.depositarCheque(cheque)
    conta2.consultarSaldo()
    conta2.sacar(301.00)

    println("Exercício Ingresso ----------")
    val exIngresso = Teste()
    exIngresso.main()

}