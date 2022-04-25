package OOP.AbstractClassesAndInterfaces

abstract class Vehicle {

    abstract val numberOfWheels: Int

    open fun info() {
        println("Number of wheels is $numberOfWheels.")
    }

    abstract fun move()

}