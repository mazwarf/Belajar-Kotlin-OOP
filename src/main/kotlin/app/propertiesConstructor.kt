package app

import data.User


fun main() {

    val user1 = User("Azwar", "rahasia")
    val user2 = User("Joko", "12aa")

    user1.username = "alex"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)
    println(user2)
}