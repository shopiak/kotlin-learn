package OOP.ClassAny

class User(var passportNumber: String, var lastName: String, var age: Int) {

    override fun toString(): String {
        return "User: [First name: $passportNumber, last name: $lastName, age: $age]"
    }

    override fun equals(other: Any?): Boolean {
        return if (other is User) {
            passportNumber == other.passportNumber
        } else false
    }
}