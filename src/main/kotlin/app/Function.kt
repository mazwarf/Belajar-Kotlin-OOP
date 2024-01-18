package app

import data.Person

fun main() {
    val azwar = Person()

    azwar.firstName = "Azwar"
    azwar.middleName = "Alex"
    azwar.lastName = "Firmasnyah"

    azwar.sayHello("badrol")
    azwar.run()
    azwar.getFullname()
    println(azwar.getFullname())
    val fullName = azwar.getFullname()
    println(fullName)


}