package OOP.ClassAny

fun main() {

    val user = User("12345678", "Ignashov", 19)
    val person = User("12345678", "Ignashov", 19)

    println(user) // User: [First name: Ostap, last name: Shopiak, age: 19]
    println(user == person)

}