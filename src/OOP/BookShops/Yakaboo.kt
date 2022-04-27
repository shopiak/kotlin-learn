package OOP.BookShops

class Yakaboo(detectiveBookPrice: Double, fantasyBookPrice: Double, scienceBookPrice: Double)
    : BookShop(detectiveBookPrice, fantasyBookPrice, scienceBookPrice), GiftCard {

    override fun sellDetecriveBook() {
        println("Your order: one book of the genre - detective.\n")
        detectiveBookCount++
    }

    override fun sellFantastyBook() {
        println("Your order: one book of the genre - fantasy.\n")
        fantasyBookCount++
    }

    override fun sellScienceBook() {
        println("Your order: one book of the genre - science.\n")
        scienceBookCount++
    }

    override fun offerGiftCard() {
        println("Take your gift card and have a nice day.")
        giftCardCount++
    }
}