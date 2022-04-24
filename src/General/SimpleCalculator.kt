fun main() {
    while (true) {
        print("Hello, it`s a calculator!\nEnter a first number: ")
        val firstNumber = readLine()!!.toDoubleOrNull()

        print("Enter a second number: ")
        val secondNumber = readLine()!!.toDoubleOrNull()

        print("Enter an operator(+, -, *, /): ")
        val operator = readLine()

        if (firstNumber == null || secondNumber == null || operator.isNullOrEmpty()) {
            println("Enter valid data.")
        } else {
            val result = calculate(firstNumber, secondNumber, operator)
            println("Result is ${result.toInt()}\n")
        }
    }
}

fun calculate(first: Double, last: Double, operator: String): Double {
    var result: Double = 0.0

    when (operator) {
        "+" -> result = first + last
        "-" -> result = first - last
        "*" -> result = first * last
        "/" -> result = first / last
    }
    return result
}