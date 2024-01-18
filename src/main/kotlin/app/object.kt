package app

import data.Person

fun main() {
    val firmansyah = Person()
    firmansyah.firstName = "azwar"

    val joko = Person()
    joko.firstName = "Joko"

    val azwar = Person()
    azwar.firstName = "Firmansyah"

    println(firmansyah.firstName)
    println(joko.firstName)
    println(azwar.firstName)
}
