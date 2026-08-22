package org.example.com.kotlinplayground.functions

fun topLevelFunction(): Int {
    return (0..100).random()
}

fun main() {

    val num = topLevelFunction()
    println("Num is : $num")

}