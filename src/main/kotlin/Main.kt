fun main(args: Array<String>) {

    // Crie uma calculadora
    println("escreva n1 ")
    val n1 = readLine()!!.toInt()
    println("escreva n2 ")
    val n2 = readLine()!!.toInt()

    println("escolha um operador")

    val operador = readLine()!!

    if (operador == "+") {
        soma(n1, n2)

        } else if (operador == "-") {
            subtração(n1, n2)
        } else if (operador == "/") {
            divisão(n1, n2)
        } else if (operador == "*") {
            multiplicação(n1, n2)
        }

    }

    fun soma(n1: Int, n2: Int) {
        val resultado = n1 + n2
        println("O resultado é $resultado")
    }

    fun subtração(n1: Int, n2: Int) {
        val resultado = n1 - n2
        println("O resultado é $resultado")
    }

    fun divisão(n1: Int, n2: Int) {
        val resultado = n1 / n2
        println("O resultado é $resultado")
    }

    fun multiplicação(n1: Int, n2: Int) {
        val resultado = n1 * n2
        println("O resultado é $resultado")
    }
}
