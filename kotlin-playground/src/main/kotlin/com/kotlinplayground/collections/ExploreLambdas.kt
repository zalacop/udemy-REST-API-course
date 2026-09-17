package org.example.com.kotlinplayground.collections

fun main() {


    val addLambda = { x: Int -> x + x }

     val addResult = addLambda(3)
    println("Add Lambda : $addResult")

    val multiplyLambda = { x: Int, y: Int -> x * y }

    val multiplyResult = multiplyLambda(2, 3)
    println("Multiply Lambda : $multiplyResult")

}