package org.example.com.kotlinplayground.classes

class Person(
    val name: String = "",       // Object oriented programming is fundamentally the blueprint for creating objects
    val age: Int = 0
) {
    var email: String = ""

    constructor(
        _email: String,
        _name: String = "",
        _age: Int = 0
    ) : this(_name, _age) {
        email = _email
    }

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

    val person2 = Person(_email = "abc@gmail.com", _name = "Kim", _age = 35)
    println("Name is : ${person2.name}, age is ${person2.age} and the email is ${person2.email}")
}