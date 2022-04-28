package OOP.Polymorphism

abstract class MessageService {

    open fun sendMessage(sender: String, receiver: String, message: String) {
            println("Send a message: \"$message\" from $sender to $receiver.")
    }

}