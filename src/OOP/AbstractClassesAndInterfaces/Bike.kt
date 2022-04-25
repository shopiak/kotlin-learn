package OOP.AbstractClassesAndInterfaces

class Bike : Vehicle() {

    override val numberOfWheels = 2

    override fun move() {
        println("Start pedaling.")
        println("The beginning of the movement.\n")
    }

}