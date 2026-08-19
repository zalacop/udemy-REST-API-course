package org.example.com.kotlinplayground.basics

fun main() {

    val range = 1..10
    for (i in range) {
        println("i : $i")
    }

    val reversRange = 10 downTo 1
    for (i in reversRange) {
        println("reversRange : $i")
    }

    for (i in reversRange step 2) {
        println("reversRange with skip: $i")
    }
    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of i is : $i")
        i++
    } while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x is : $x")
        x++
    }
}