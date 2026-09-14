package org.example.com.kotlinplayground.collections

fun main() {
    val names = listOf("Alex", "Ben", "Chloe")
    println("Names: $names")


    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("Names mutable list before add: $namesMutableList")
    namesMutableList.add("Adam")
    println("Names mutable list after add: $namesMutableList")
}