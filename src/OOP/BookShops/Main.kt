package OOP.BookShops

import kotlin.system.exitProcess

fun main() {

    val yakabooLviv = Yakaboo(153.0, 94.5, 225.5)
    val knigiuaRivne = KnigiUA(157.5, 97.5, 240.0)

    while (true) {
        println("\nHello, dear buyer. Choose a store:")
        println("1. Yakaboo in Lviv.\n2. \"KnigiUA\" in Rivne.\n")

        var currentShop = when(readLine()) {
            "1" -> yakabooLviv
            "2" -> knigiuaRivne
            else -> {
                println("I'm sorry, sorry, but there is no such shop.\n")
                break
            }
        }
        chooseBook(currentShop)
    }
}

private fun chooseBook(currentShop: BookShop) {
    println("Choose a book genre:\n")
    println("1. Detective book.\n2. Fantasy book.\n3. Science book.\n0. Show statistics.\n")

    when (readLine()) {
        "1" -> {
            currentShop.sellDetecriveBook()
            askForGiftCard(currentShop)
        }
        "2" -> {
            currentShop.sellFantastyBook()
            askForGiftCard(currentShop)
        }
        "3" -> {
            currentShop.sellScienceBook()
            askForGiftCard(currentShop)
        }
        "0" -> currentShop.showStatisticsSold()
        else -> {
            println("Error.")
            exitProcess(1)
        }
    }
}

private fun askForGiftCard(currentShop: BookShop) {
    if (currentShop is GiftCard) {
        println("Do you want to buy a gift card?(yes/no).")

        if (readLine()?.toLowerCase() == "yes") currentShop.offerGiftCard()
    }
}