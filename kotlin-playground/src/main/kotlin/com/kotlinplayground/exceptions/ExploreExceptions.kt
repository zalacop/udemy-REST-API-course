package org.example.com.kotlinplayground.exceptions

fun main() {

    println("Name length is :${nameLength("Zala")}")
}

fun nameLength(name: String) : Int {
    return name!!.length
}
