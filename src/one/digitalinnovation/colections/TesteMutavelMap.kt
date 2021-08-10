package one.digitalinnovation.colections

fun main (){
    val joao = Funcionario("João", 2000.0 , "CLT")
    val pedro = Funcionario("Pedro", 1500.0 , "CLT" )
    val maria = Funcionario("Maria", 4000.0 , "CNPJ")

    val id = String(stringBuilder = funcionario.nome)
    val repositorio = Repositorio<Funcionario>()

    repositorio.create {joao.nome; João}
    repositorio.create {pedro.nome; Pedro}
    repositorio.create {maria.nome; Maria}

    println(repositorio.findByid(joao.nome))

    println("................")
    repositorio.findAllid().forEach { println(it) }

    println("................")
    repositorio.remove(joao.nome)
    repositorio.findAllid().forEach { println(it) }


}