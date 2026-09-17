package org.example.com.kotlinplayground.collections

fun main() {
    val names = listOf("Alex", "Ben", "Chloe")
    println("Names: $names")


    val namesMutableList = mutableListOf("Alex", "Ben", "Chloe")
    println("Names mutable list before add: $namesMutableList")
    namesMutableList.add("Adam")
    println("Names mutable list after add: $namesMutableList")

    val set = setOf("Alex", "Ben", "Chloe")
    println("Set: $set")

    val mutableSet = mutableSetOf("Alex", "Ben", "Chloe")
    println("MutableSet before add: $mutableSet")
    mutableSet.add("Adam")
    println("MutableSet after add: $mutableSet")
}