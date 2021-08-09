package one.digitalinnovation.colections

fun main () {
    val salarios = doubleArrayOf(1000.0 , 2000.0 , 3000.0)

    for (salario in salarios) {
        println(salario)
    }

    println ("..............................")
    //println ("Maior salário: ${salarios.max()}") -- devia mostrar o valor máximo do array, mas não funciona como deveria
    //println ("Menor salário: ${salarios.min()}") -- devia mostrar o valor mínimo do array, mas não funciona como deveria
    println ("Maior salário: ${salarios.maxOrNull()}")
    println ("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println ("..............................")

    salariosMaiorQue2500.forEach { print(it) }

    println ("..............................")
    println(salarios.count { it in 2000.0..5000.00 })

    println ("..............................")
    println(salarios.find { it == 2000.0 })
    println(salarios.find { it == 5000.0 }) // o que acontece quando procura um que não existe

    println ("..............................")
    println(salarios.any { it == 1000.0 }) //elemento em que a coleção seja verdadeira
    println(salarios.any { it == 7000.0 }) //elemento em que a coleção seja falsa
}