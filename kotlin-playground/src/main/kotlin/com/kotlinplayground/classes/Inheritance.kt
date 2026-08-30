package org.example.com.kotlinplayground.classes

open class User(val name: String) {

    open fun login() {
        println("Inside user login")
    }
}

class Student(name: String) : User(name) {
    override fun login() {
        println("Inside student login")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Zala")
    println("Name is: ${student.name}")
    student.login()

    val instructor = Instructor("Dilip")
    println("Name is: ${instructor.name}")
    instructor.login()
}