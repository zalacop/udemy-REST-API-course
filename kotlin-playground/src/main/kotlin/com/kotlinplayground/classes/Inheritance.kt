package org.example.com.kotlinplayground.classes

open class User(val name: String) {

}

class Student(name: String) : User(name)

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Zala")
    println("Name is: ${student.name}")

    val instructor = Instructor("Dilip")
    println("Name is: ${instructor.name}")
}