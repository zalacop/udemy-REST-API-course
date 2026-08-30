package org.example.com.kotlinplayground.classes

open class User(val name: String) {

    open var isLoggedIn: Boolean = false
    open fun login() {
        println("Inside user login")
    }
}

class Student(name: String) : User(name) {

    override var isLoggedIn: Boolean = false
    override fun login() {
        println("Inside student login")
        super.login()
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Zala")
    println("Name is: ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in value is: ${student.isLoggedIn}")

    val instructor = Instructor("Dilip")
    println("Name is: ${instructor.name}")
    instructor.login()
}