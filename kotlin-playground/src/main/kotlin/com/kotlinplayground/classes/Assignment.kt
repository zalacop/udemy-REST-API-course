package org.example.com.kotlinplayground.classes

data class Employee(
    val id: Int,
    val name: String)

fun main() {
    val employee = Employee(id = 1, name = "Eric")
    println(employee)
}
