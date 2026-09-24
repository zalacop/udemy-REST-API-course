package org.example.com.kotlinplayground.exceptions

fun returnNothing(): Nothing {
    throw RuntimeException("This is an exception")
}

fun main() {

    println("Name length is :${nameLength("Zala")}")
    println("Name length is :${nameLength(null)}")
    returnNothing()
}

fun nameLength(name: String?) : Int? {
    return try {
        name!!.length
    } catch (ex: Exception) {
        println("Exception is : $ex")
        null
    }
}
