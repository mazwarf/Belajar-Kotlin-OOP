package app

import data.Person

fun main() {
    val azwar = Person()
    azwar.firstName = "Azwar"

    azwar.sayHello("alya")
    azwar.sayHello("alya", "Azzahra")
}