package OOP.Polymorphism

class PhoneService : MessageService() {

    override fun sendMessage(sender: String, receiver: String, message: String) {
        if (sender.toString().length == 9 && receiver.toString().length == 9)
            super.sendMessage(sender, receiver, message)
    }

}