package OOP.AbstractClassesAndInterfaces

class Car : Vehicle(), Moveable, Stoppable {

    override val numberOfWheels = 4
    override val speed = 200.0

    override fun move() {
        println("Start the engine.")
        println("The beginning of the movement.\n")
    }

    override fun stop() {
        println("The stop begins.")
    }

    override fun info() {
        println("Some info.")
    }


}