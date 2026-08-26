package org.example.com.kotlinplayground.classes

class Item() {

    var name: String = ""

    constructor(_name: String) : this() {
        name = _name
    }
}


fun main() {
    val item = Item(_name = "iPhone")
    println("Name is : ${item.name}")
}
