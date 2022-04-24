fun main() {
    val answer = getAnswer("My question.")
    println(answer?.toUpperCase()) // null
}

fun getAnswer(question: String): String? {
    var answer: String? = null

    if (question.length <= 10) answer = "This is ur answer."

    return answer
}