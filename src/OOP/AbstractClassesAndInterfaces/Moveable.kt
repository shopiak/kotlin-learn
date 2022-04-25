package OOP.AbstractClassesAndInterfaces

interface Moveable {

    val speed: Double

    fun move()

    fun info() {
        println("Hello from interface.")
    }

}