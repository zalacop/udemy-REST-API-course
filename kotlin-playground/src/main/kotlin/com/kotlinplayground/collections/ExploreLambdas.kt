package org.example.com.kotlinplayground.collections


// Higher order function

fun calculate(x: Int, y: Int, op : (x: Int, y: Int) -> Int): Int {
    return op(x, y)
}

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

    val result = calculate(2, 3) { a, b -> a * b }
    println("Result : $result")

    val add = calculate(2, 3) { a, b -> a + b }
    println("Add result : $add")
}

// Lambda expressions are small pieces of code that can be passed to other functions
// Benefit of Lambda: - you can assign the behavior to a variable
//                    - the advantage is that, you can pass the lambda as an argument to other functions