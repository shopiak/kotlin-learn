package OOP.Inheritance

fun main() {

    val dog = Dog("Jinsoy", "Guff-guff")
    dog.sleep() // Dog Jinsoy is speeling outside the house. -> override
    dog.getVoice()

    val cat = Cat("Musya", "Meouw")
    cat.sleep() // Musya is sleeping.
    cat.getVoice()
}