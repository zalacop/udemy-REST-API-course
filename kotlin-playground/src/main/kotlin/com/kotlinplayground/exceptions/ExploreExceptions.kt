package org.example.com.kotlinplayground.exceptions

fun main() {

    println("Name length is :${nameLength("Zala")}")
    println("Name length is :${nameLength(null)}")
}

fun nameLength(name: String?) : Int? {
    try {
        return name!!.length
    } catch (ex: Exception) {
        println("Exception is : $ex")
        return null
    }
}
