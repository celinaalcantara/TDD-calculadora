fun main() {

    var opcao = 0

    println("\nCalculadora\n")
    println("Digite o 1° número: ")
    var num1 = readLine()!!.toDouble()

    println("Digite o 2° número: ")
    var num2 = readLine()!!.toDouble()

    do {

        println(
        "Escolha uma operação:" +
                "\n1 - Adição" +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão"
        )
        opcao = readLine()!!.toInt()

        when (opcao) {

            1 -> println(adicao(num1, num2))
            2 -> println(subtracao(num1, num2))
            3 -> println(multiplicacao(num1, num2))
            4 -> println(divisao(num1, num2))
            else -> println("Operação inválida.\n")
        }

    }while (!(opcao >= 1 && opcao <= 4))


}

fun adicao(num1: Double, num2: Double): Double{
    println("O resultado de $num1 + $num2 é: ")
    return num1 + num2
}
fun subtracao(num1: Double, num2: Double): Double {
    println("O resultado de $num1 - $num2 é: ")
    return num1 - num2
}
fun multiplicacao(num1: Double, num2: Double): Double {
    println("O resultado de $num1 * $num2 é: ")
    return num1 * num2
}
fun divisao(num1: Double, num2: Double): Double {
    println("O resultado de $num1 / $num2 é: ")
    return num1 / num2
}

