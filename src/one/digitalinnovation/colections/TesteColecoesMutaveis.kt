package one.digitalinnovation.colections

fun main (){
    val joao = Funcionario("João", 2000.0 , "CLT")
    val pedro = Funcionario("Pedro", 1500.0 , "CLT" )
    val maria = Funcionario("Maria", 4000.0 , "CNPJ")

    val funcionarios = mutableListOf(joao , maria)
    funcionarios.forEach{println(it)}

    println (".................")
    funcionarios.add(pedro) //adicionou Pedro
    funcionarios.forEach{println(it)}

    println (".................")
    funcionarios.remove(joao) //removeu João
    funcionarios.forEach{println(it)}

    println (".................")
    val funcionariosSet = mutableListOf(joao)
    funcionariosSet.forEach{println(it)}

    println (".................")
    funcionariosSet.add(maria)
    funcionariosSet.add(pedro)
    funcionariosSet.forEach{println(it)}

    println (".................")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach{println(it)}

}