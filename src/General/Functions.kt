fun main() {
    var userNames = arrayOf("Persi", "Eustace", "Marlboro", "Jackson")

    foo() // -> Hello function
    returnListOfUserNames(userNames)

    if (readLine() == "Return list of user names again") returnListOfUserNames(userNames)

    println(calculate(2032, 2302))
}

fun foo() {
    println("Hello function")
}

fun returnListOfUserNames(arr: Array<String>) {
    for (names in arr) {
        println("Hello there, $names")
    }
}

fun calculate(a: Int, b: Int): Int {
    return a + b
}