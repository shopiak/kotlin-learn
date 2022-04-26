package OOP.CoffeeShops

class LvivCoffeShop(americanoPrice: Double,cappucсinoPrice: Double, latePrice: Double)
    : CoffeShop(americanoPrice,cappucсinoPrice, latePrice), Biscuits {

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Lviv coffe shop!")
    }

    override fun makeCappuccino() {
        cappucсinoCount++
        println("Thanks for order Cappuccino in Lviv coffe shop!")
    }

    override fun makeLate() {
        lateCount++
        println("Thanks for order Late in Lviv coffe shop!")
    }

    override fun sellBiscuits() {
        println("Take your biscuits.")
    }
}