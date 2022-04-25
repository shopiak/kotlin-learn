package OOP.AbstractClassesAndInterfaces

class Train : Moveable {

    override val speed = 392.2

    override fun move() {
        println("The train starts moving.")
    }
}