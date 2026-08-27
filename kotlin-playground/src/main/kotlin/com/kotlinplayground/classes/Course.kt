package org.example.com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(id = 1, name = "Reactive Programming in modern Java using Project reactor", author = "Alice")

    //println(course)

    val course1 = Course(id = 2, name = "Reactive Programming in modern Java using Project reactor", author = "Alice")

    println("Checking object equality : ${course == course1}")

    val course2 = course1.copy(id = 3, author = "Dilip" )

    println(course2)
}