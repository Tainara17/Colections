package one.digitalinnovation.colections

fun main () {
    val joao = Funcionario("João", 2000.0 , "CLT")
    val pedro = Funcionario("Pedro", 1500.0 , "CLT" )
    val maria = Funcionario("Maria", 4000.0 , "CNPJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2) //faz união dos conjuntos
    resultUnion.forEach { println(it) }

    println ("...............")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtraction = funcionarios3.subtract(funcionarios2) // subtrai um grupo de outro
    resultSubtraction.forEach { println(it) }

    println ("...............")
    val resultIntercection = funcionarios3.intersect(funcionarios2) // mostra o elemento que pertence a ambos os conjuntos
    resultIntercection.forEach { println(it) }
}
