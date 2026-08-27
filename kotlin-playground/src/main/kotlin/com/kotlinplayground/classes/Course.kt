package org.example.com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String
)

//data classes are primary for classes that's going to behave as a data container
//it auto-generates a lot of functionalities for you when you add  the DATA modifier tot the class
//its pretty easy to create a clone of an object using the copy() function

fun main() {
    val course = Course(id = 1, name = "Reactive Programming in modern Java using Project reactor", author = "Alice")

    //println(course)

    val course1 = Course(id = 2, name = "Reactive Programming in modern Java using Project reactor", author = "Alice")

    println("Checking object equality : ${course == course1}")

    val course2 = course1.copy(id = 3, author = "Dilip" )

    println(course2)
}