class Building(var floors: Int = 2, var lenght: Double, var width: Double) {
//  var floors: Int = 2 - default value
//  true -> .. lenght, .. width, .. floors - default

    fun build(streetNumber: Int, streetName: String) {
        println("The house will be built on $streetName, $streetNumber.")
    }

    fun destroy() {
        println("Destoying.")
    }

    fun square(): Double {
        return lenght * width
    }

}