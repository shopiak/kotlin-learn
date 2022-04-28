package OOP.Polymorphism

class EmailService : MessageService() {

    override fun sendMessage(sender: String, receiver: String, message: String) {
        if (sender.contains("@") && receiver.contains("@"))
            super.sendMessage(sender, receiver, message)
    }

}