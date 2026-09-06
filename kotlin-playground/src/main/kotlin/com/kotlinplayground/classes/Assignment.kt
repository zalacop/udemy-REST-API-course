package org.example.com.kotlinplayground.classes

data class Employee(
    val id: Int,
    val name: String)

fun main() {
    val employee = Employee(id = 1, name = "Eric")
    println(employee)

    val employee2 = Employee(id = 1, name = "Eric")
    println(employee == employee2)

    val employee3 = Employee(id = 3, name = "Joe")
    println(employee3)

}
