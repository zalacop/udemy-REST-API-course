package org.example.com.kotlinplayground.cast

import org.example.com.kotlinplayground.classes.Course


fun checkType(type: Any) {

    when(type) {

        is Course -> {
            println(type)
        }
    }
}

fun main() {

    val course = Course(id = 1, name = "Reactive Programming in modern Java using Project reactor", author = "Alice")

    checkType(course)

}


