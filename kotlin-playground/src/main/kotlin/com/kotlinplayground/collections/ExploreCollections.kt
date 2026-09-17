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

    val nameAgeMap = mapOf("Dilip" to 34, "Scooby" to 4)
    println("NameAge Map: $nameAgeMap")

    val nameAgeMutableMap = mutableMapOf("Dilip" to 34, "Scooby" to 4)
    println("NameAge Map before put: $nameAgeMap")
    nameAgeMutableMap.put("abc", 100)
    println("NameAge MutableMap after put: $nameAgeMutableMap")
}