import kotlin.system.exitProcess

fun main() {
    print("Enter names using comma (, ) as separator: ")
    val names = readLine().orEmpty()

    val namesArray = names.split(", ")

    print("Enter selaries using comma (, ) as separator: ")
    val salaries = readLine().orEmpty()

    val salariesArray = salaries.split(", ")

    if (namesArray.size != salariesArray.size) {
        println("Names list must be the same salaries list.")
        exitProcess(0)
    }

    /*
    1st - 14, 2st - 9
    ---------------------------------------------------
    |   Name    |                Salary               |
    |   Name    |                Salary               |
    |   Name    |                Salary               |
    ---------------------------------------------------
     */

    validateLength(namesArray, 10, "Name")
    validateLength(salariesArray, 6, "Salary")

    printTable(namesArray, salariesArray)
}

fun printTable(namesArray: List<String>, salariesArray: List<String>) {
    println("-".repeat(23))
    for (name in namesArray) {
        val index = namesArray.indexOf(name)
        val salary = salariesArray[index]

//      Spaces
        val f1 = (12 - name.length) / 2
        val f2 = (12 - name.length) - f1
        val s1 = (8 - salary.length) / 2
        val s2 = (8 - salary.length) - s1

//      A little scary =)
        print("|"); print(" ".repeat(f1));
        print(name); print(" ".repeat(f2));
        print("|"); print(" ".repeat(s1));
        print(salary); print(" ".repeat(s2)); println("|");
    }
    println("-".repeat(23))
}

fun validateLength(namesArray: List<String>, maxSize: Int, entity: String) {
    for (name in namesArray) {
        if (name.length > maxSize) {
            println("$entity must be up to $maxSize characters.")
            exitProcess(0)
        }
    }
}
