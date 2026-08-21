package org.example.com.kotlinplayground.functions

fun printName(name: String) : Unit {    //Unit is a type in kotlin which represents no value
    println("Name is: $name")
}

fun addition(x: Int, y: Int): Int {
   return x + y
}

fun addition_approach1(x: Int, y: Int) = x + y

fun main() {

    val unit = printName("Zala")    //Unit is a type in kotlin which represents no value
    println("Unit is $unit")
    val result = addition(1,2)
    println("Result is $result")

    val result1 = addition_approach1(1,2)
    println("Result is $result1")

}



