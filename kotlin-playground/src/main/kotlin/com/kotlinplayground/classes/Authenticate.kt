package org.example.com.kotlinplayground.classes

object Authenticate {       //This keyword allows us to create a class and an instance of the class at the same time

    fun authenticate(userName: String, password: String) {
        println("User authenticate for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate(userName = "Zala", password = "abc")
}