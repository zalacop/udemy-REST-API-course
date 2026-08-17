package org.example.com.kotlinplayground.basics

fun main() {
    val name = "Zala"
    println(name)

    //name = "Zala1"

    var age = 34
    println(age)
    age = 35
    println(age)

    val salary = 30000L
    println(salary)

    val course = "Kotlin Spring"
    println("course = $course and the course length is ${course.length}")       //String Interpolation

    val multiLine = "ABC \n DEF"
    println(multiLine)

    val multiLine1 = """
        ABC
        DEF
    """.trimIndent()           //Multiline strings using TripleQuotes
    println(multiLine1)

}