package org.example.com.kotlinplayground.classes

object Authenticate {

    fun authenticate(userName: String, password: String) {
        println("User authenticate for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate(userName = "Zala", password = "abc")
}