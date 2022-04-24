fun main() {
    var string = "Lorem ipsum dolor sit amet, consectetur"
    println(string[0]) // L
    println(string.first())
    println(string[string.length - 1]) // r
    println(string.last())

    println(string.take(10)) // Lorem ipsu
    println(string.takeLast(10)) // onsectetur

    println(string.contains("ipsum", true)) // true
    println(string.contains("Amet", true)) // true
    println(string.contains("Amet")) // false

    println(string.reversed()) // rutetcesnoc ,tema tis rolod muspi meroL

    string = "Hello Kotlin"
    println(string.substring(2)) // Hello Kotlin -> llo Kotlin
    println(string.substring(1,3)) // el [1, 3)
    println(string.substring(3..9)) // lo Kotl [3..9]

    val cardNumber = "5375 4141 2823 2220"
    println(cardNumber.startsWith("5375")) // true
    println(cardNumber.endsWith("5152")) // false

    string = "Hello"
    println("The length of \"Hello\" is ${string.length} symbol")

    var userName = "eustace"
    println(userName.capitalize()) // Eustace
    println(userName.decapitalize()) // eustace
    println(userName.toUpperCase()) // EUSTACE
    println(userName.toLowerCase()) // eustace

    var emptyUserName = " "
    println(emptyUserName.isEmpty()) // false -> space is a symbol
    println(emptyUserName.isBlank()) // true -> the string is not empty but has no meaning

    userName = " Alexandrovich "
    println(userName.trimStart()) // "Alexandrovich "
    println(userName.trimEnd()) // " Alexandrovich"
    println(userName.trim()) // "Alexandrovich"

    string = "Lorem ipsum dolor sit amet, consectetur Dolor?"
    println(string.toLowerCase().replace("dolor", "*****"))
    // lorem ipsum ***** sit amet, consectetur *****?

    val list = "Bread, Milk, Orange, Mango"
    val shoppingList = list.split(", ")
    println(shoppingList) // [Bread, Milk, Orange, Mango]

    shoppingList.forEachIndexed() { index, product ->
        println("The ${index + 1} product is ${product.toLowerCase()}.")
    }

    /*
        The 1 product is bread.
        The 2 product is milk.
        The 3 product is orange.
        The 4 product is mango.
    */

    val input = readLine() // <- Lorem impus
    println(input?.toUpperCase()) // LOREM IMPUS
}