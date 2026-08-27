package org.example.com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

fun main() {
    val course = Course(id = 1, name = "Reactive Programming in modern Java using Project reactor", author = "Alice")
}