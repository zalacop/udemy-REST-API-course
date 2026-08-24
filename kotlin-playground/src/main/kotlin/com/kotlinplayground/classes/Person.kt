package org.example.com.kotlinplayground.classes

class Person(val name: String = "",       // Object oriented programming is fundamentally the blueprint for creating objects
             val age: Int = 0) {

    fun action() {
        println("Person walks.")
    }
}

fun main() {
    val person = Person(name = "Alex", age = 25)
    person.action()
    println("Name is : ${person.name} and age is ${person.age}")

    val person1 = Person()
    println("Name is : ${person1.name} and age is ${person1.age}")
}