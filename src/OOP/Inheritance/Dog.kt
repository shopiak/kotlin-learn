package OOP.Inheritance

class Dog(name: String, voice: String) : Animal(name, voice) {

    override fun sleep() {
        println("Dog $name is speeling outside the house.")
    }

}