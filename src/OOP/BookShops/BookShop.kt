package OOP.BookShops

abstract class BookShop(val detectiveBookPrice: Double, val fantasyBookPrice: Double, val scienceBookPrice: Double) {

    var detectiveBookCount = 0
    var fantasyBookCount = 0
    var scienceBookCount = 0
    var giftCardCount = 0

    abstract fun sellDetecriveBook()
    abstract fun sellFantastyBook()
    abstract fun sellScienceBook()

    fun showStatisticsSold() {
        println("The detective books sold: $detectiveBookCount")
        println("The fantasy books sold: $fantasyBookCount")
        println("The science books sold: $scienceBookCount")
        println("The gift cards sold: $giftCardCount\n")

        var money = detectiveBookCount * detectiveBookPrice + fantasyBookCount * fantasyBookPrice
            + scienceBookCount * scienceBookPrice

        println("\tMoney earned: $money")
    }

}