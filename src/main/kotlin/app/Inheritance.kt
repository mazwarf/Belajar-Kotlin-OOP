package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Azwar")
    manager.sayHello("Alya")

    val vicePresident = VicePresident("Alex")
    vicePresident.sayHello("Joko")
}