package org.example.com.kotlinplayground.collections

fun main() {
    
    val namesListUsingSequence = listOf("alice", "bob", "charlie")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()

    println("Names list using sequences : $namesListUsingSequence")
}