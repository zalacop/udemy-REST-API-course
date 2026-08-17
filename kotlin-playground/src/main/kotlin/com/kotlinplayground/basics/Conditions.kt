package org.example.com.kotlinplayground.basics

fun main() {
    //if-else
    //when

    var name = "Anders"
    name = "Chloe"

    val result = if (name.length  ==4) {
        println("Name is four characters")
        name
    } else{
        println("Name is not four characters")
        name
    }

    println("result : $result")

}