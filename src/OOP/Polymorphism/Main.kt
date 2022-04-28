package OOP.Polymorphism

fun main() {

//    val messageService = MessageService()
//    messageService.sendMessage("ostap.oleksa@ua.com", "eustace@emerald.rp", "Hello there!")
//    messageService.sendMessage(123456789, 987654321, "Hello there?")

    val emailService = EmailService()
    val phoneService = PhoneService()

    emailService.sendMessage("ostap.oleksa@ua.com", "eusace@emerald.rp", "Hello there!")
    phoneService.sendMessage("123456789", "987654321", "Hello there?")

}