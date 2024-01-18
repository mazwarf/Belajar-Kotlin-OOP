package app

import data.Car

fun main() {
    val kijang = Car("Toyota")
    kijang.year = 1998

    val almaz = Car("Wuling", "Almaz")

    println(kijang.brand)
    println(kijang.year)
    println(almaz.brand)
    println(almaz.year)
}