package OOP.Inheritance

open class Animal(val name: String, val voice: String) {

    open fun sleep() {
        println("$name is sleeping.")
    }

    open fun getVoice() {
        println(voice)
    }

}