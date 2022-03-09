fun main() {

    var opcao = 0

    println("\nCalculadora\n")
    println("Digite o 1° número: ")
    var num1 = readLine()!!.toDouble()

    println("Digite o 2° número: ")
    var num2 = readLine()!!.toDouble()

    println("Escolha uma operação:" +
            "\n1 - Adição" +
            "\n2 - Subtração" +
            "\n3 - Multiplicação" +
            "\n4 - Divisão")
    opcao = readLine()!!.toInt()

    when(opcao){
        1 -> println("O resultado de $num1 + $num2 é: ${num1 + num2}.")
        2 -> println("O resultado de $num1 - $num2 é: ${num1 - num2}.")
        3 -> println("O resultado de $num1 * $num2 é: ${num1 * num2}.")
        4 -> println("O resultado de $num1 / $num2 é: ${num1 / num2}.")

    }

}