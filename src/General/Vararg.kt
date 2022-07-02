package General

fun main() {

    printStrings("Ostap", "Oleg", "Nastiaa")
    printStrings("Kotlin", "C++", "C", "C#", "Java", "Swift")

    sum(1, 2, 3, 4, 5, 6, 7, 8)
    sum(1, 2, 3, 4, 5, 6, 7, 8, 11, 13, 204, 1323)

    printUserGroup(3, "Ostap", "Nastiaa", "Oleg")

//    Spread operator
    val nums = intArrayOf(1, 2, 3, 4)
    changeNumbers(*nums, koef = 4)

}

fun printStrings(vararg strings: String) {
    for (str in strings) println(str)
}

fun sum(vararg numbers: Int) {
    var result = 0
    for (number in numbers) result += number
    println("Sum of numbers is $result")
}

fun printUserGroup(count: Int, vararg users: String) {
    println("Count: $count")
    for (user in users) println(user)
}

//    Spread operator
fun changeNumbers(vararg numbers: Int, koef: Int) {
    for (number in numbers) println(number * koef)
}