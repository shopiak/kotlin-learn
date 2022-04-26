package OOP.CoffeeShops

abstract class CoffeShop(val americanoPrice: Double, val cappucсinoPrice: Double, val latePrice: Double) {

    var americanoCount = 0
    var cappucсinoCount = 0
    var lateCount = 0

    abstract fun makeAmericano()
    abstract fun makeCappuccino()
    abstract fun makeLate()

    fun showStatistics() {
        println("\nAmericano sold: $americanoCount")
        println("Cappuccino sold: $cappucсinoCount")
        println("Late sold: $lateCount")

        val money = americanoCount * americanoPrice + cappucсinoCount * cappucсinoPrice + lateCount * latePrice

        println("\tMoney earned: $money")
    }

}