package OOP.BookShops

class KnigiUA(detectiveBookPrice: Double, fantasyBookPrice: Double, scienceBookPrice: Double)
    : BookShop(detectiveBookPrice, fantasyBookPrice, scienceBookPrice) {

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
}