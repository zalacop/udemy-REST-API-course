package org.example.com.kotlinplayground.cast

import org.example.com.kotlinplayground.classes.Course


fun checkType(type: Any) {

    when(type) {

        is Course -> {
            val course = type as Course
            println(type.copy())
        }
        is String -> {
            println(type.lowercase())
        }
    }
}

fun castNumber(any: Any) {

    when (any) {
        any as Double -> println("Value is double")
    }
}

fun main() {

    val course = Course(id = 1, name = "Reactive Programming in modern Java using Project reactor", author = "Alice")

    checkType(course)
    checkType("ALICE")

    castNumber(1.0)
    //castNumber(1)

    val number = 1
    val numberDouble = number.toDouble()
    println(numberDouble)
}




