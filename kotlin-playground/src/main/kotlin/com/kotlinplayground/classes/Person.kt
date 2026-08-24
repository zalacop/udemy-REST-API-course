package org.example.com.kotlinplayground.classes

class Person(val name: String,       // Object oriented programming is fundamentally the blueprint for creating objects
             val age: Int) {

    fun action() {
        println("Person walks.")
    }
}

fun main() {
    val person = Person(name = "Alex", age = 25)
    person.action()
    println("Name is : ${person.name} and age is ${person.age}")
}