package OOP.AccessModifiers

abstract class Animal(protected val voice: String) {

    open val maxAge = 100

    init {
        println("Created a new animal class object.")
    }

    protected open fun makeVoice() {
        println(voice)
    }

    open fun sleep() {
        println("I'm sleeping.")
    }

    abstract fun eat()
}