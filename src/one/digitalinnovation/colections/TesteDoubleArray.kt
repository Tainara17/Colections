package one.digitalinnovation.colections

fun main() {
    val salarios = DoubleArray(size = 3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salarios ->
        salarios [ index ] = salario * 1.1
    }
    salarios.forEach { println(it) }
}
