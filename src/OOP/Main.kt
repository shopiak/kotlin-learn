fun main() {

    val house = Building(2, 4.20, 8.50)
    println("${house.lenght} meters.") // 4.2 meters.

    house.build(20, "Shevchenko Street")
    house.destroy() // Destoying.
    println(house.square()) // 35.7
}