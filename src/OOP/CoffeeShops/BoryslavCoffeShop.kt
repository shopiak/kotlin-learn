package OOP.CoffeeShops

class BoryslavCoffeShop(americanoPrice: Double, cappucсinoPrice: Double, latePrice: Double)
    : CoffeShop(americanoPrice,cappucсinoPrice, latePrice) {

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Boryslav coffe shop!")
    }

    override fun makeCappuccino() {
        cappucсinoCount++
        println("Thanks for order Cappuccino in Boryslav coffe shop!")
    }

    override fun makeLate() {
        lateCount++
        println("Thanks for order Late in Boryslav coffe shop!")
    }

}