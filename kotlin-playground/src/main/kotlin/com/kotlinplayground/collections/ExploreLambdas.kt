package org.example.com.kotlinplayground.collections

fun main() {


    val addLambda = { x: Int -> x + x }

     val addResult = addLambda(3)
    println("Add Lambda : $addResult")

    val multiplyLambda = { x: Int, y: Int ->
        println("Multiply x is $x and y is $y")
        x * y
    }

    val multiplyResult = multiplyLambda(2, 3)
    println("Multiply Lambda : $multiplyResult")

}

// Lambda expressions are small pieces of code that can be passed to other functions
// Benefit of Lambda: - you can assign the behavior to a variable
//                    - the advantage is that, you can pass the lambda as an argument to other functions