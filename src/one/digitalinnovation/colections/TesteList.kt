package one.digitalinnovation.colections

fun main () {

    val joao = Funcionario("João", 2000.0 , "CLT")
    val pedro = Funcionario("Pedro", 1500.0 , "CLT" )
    val maria = Funcionario("Maria", 4000.0 , "CNPJ")

    val funcionarios = listOf(joao , pedro , maria)

    funcionarios.forEach { println(it) }
    println ("................")
    println(funcionarios.find { it.nome == "Maria" })

    println ("................")
    funcionarios
        .sortedBy { it.salario } //ordena pelo salário
        .forEach { println(it) }

    println ("................")
    funcionarios
        .sortedBy { it.nome } // ordena pelo nome
        .forEach { println(it) }

    println ("................")
    funcionarios
        .groupBy { it.tipoContrato }
        .forEach { println(it) }

}
data class  Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContrato: String,
) {
    override fun toString() : String =
    """"
        Nome: $nome
        Salário: $salario

    """.trimIndent ()
}