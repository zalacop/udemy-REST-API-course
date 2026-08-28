package org.example.com.kotlinplayground.classes

class Item() {

    var name: String = ""
    var price: Double = 0.0
        get() {

            println("Inside Getter")
            return field
        }
    set(value) {
        if (value >= 0.0){
            field = value
            println("Inside Setter")
        } else {
            throw IllegalArgumentException("Negative price is not allowed!")
        }
    }

    constructor(_name: String) : this() {
        name = _name
    }
}


fun main() {
    val item = Item(_name = "iPhone")
    println("Name is : ${item.name}")
    item.name = "iPhone 17 Pro"
    println("Name is : ${item.name}")
    item.price = -10.0
    println(item.price)
}


//Use Primary constructors whenever possible.
//Use default values for overloaded constructor scenario
//Use Secondary constructors only when necessary
