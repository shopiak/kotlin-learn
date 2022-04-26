package OOP.CoffeeShops

import kotlin.system.exitProcess

fun main() {

    val boryslavCoffeShop = BoryslavCoffeShop(25.5, 33.0, 21.5)
    val lvivCoffeShop = LvivCoffeShop(27.3, 31.3, 24.5)
    var currentCoffeShop: CoffeShop

    while (true) {
        println("\nHello there. Choose a city:")
        println("1. Lviv.\n2. Boryslav.\n0. Exit.\n")

        currentCoffeShop = when (readLine()) {
            "1" -> lvivCoffeShop
            "2" -> boryslavCoffeShop
            "0" -> break
            else -> {
                println("Error.")
                continue
            }
        }
        chooseDrink(currentCoffeShop)
    }
}

private fun chooseDrink(currentCoffeShop: CoffeShop) {
    println("\nChoose a drink:")
    println("1. Americano.\n2. Cappuccino.\n3. Late.\n0.Show statistics.\n")

    when (readLine()) {
        "1" -> {
            currentCoffeShop.makeAmericano()
            checkAndAskForBiscuits(currentCoffeShop)
        }
        "2" -> {
            currentCoffeShop.makeCappuccino()
            checkAndAskForBiscuits(currentCoffeShop)
        }
        "3" -> {
            currentCoffeShop.makeLate()
            checkAndAskForBiscuits(currentCoffeShop)
        }
        "0" -> currentCoffeShop.showStatistics()
        else -> {
            println("Error.")
            exitProcess(1)
        }
    }
}

private fun checkAndAskForBiscuits(currentCoffeShop: CoffeShop) {
    if (currentCoffeShop is Biscuits) {
        println("\nWould you like biscuits?:")
        println("1. Yes.\n2. No.\n")

        val isBiscuits = readLine()

        if (isBiscuits == "1") currentCoffeShop.sellBiscuits()
    }
}