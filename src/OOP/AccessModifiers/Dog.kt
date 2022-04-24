package OOP.AccessModifiers

class Dog(voice: String) : Animal(voice) {

    override val maxAge = 20

    init {
        println("Created a new object - Dog.")
    }

    override fun sleep() {
        super.sleep()
        println("I'm a dog.")
    }

    public override fun makeVoice() {
        println("$voice, i'm an animal!")
    }

    override fun eat() {
        println("I'm eating.")
    }

    fun info() {
        println("Dog max age is $maxAge.")
        println("Animal max age is ${super.maxAge}")
    }

}