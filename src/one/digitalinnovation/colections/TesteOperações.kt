package one.digitalinnovation.colections

fun main () {
    val salarios = doubleArrayOf(1000.0 , 2000.0 , 3000.0)

    for (salario in salarios) {
        println(salario)
    }

    println ("..............................")
    //println ("Maior salário: ${salarios.max()}") -- devia mostrar o valor máximo do array, mas não funciona como deveria
    //println ("Menor salário: ${salarios.min()}") -- devia mostrar o valor mínimo do array, mas não funciona como deveria
    println("Média salarial: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println ("..............................")
    salariosMaiorQue2500.forEach { print(it) }



}