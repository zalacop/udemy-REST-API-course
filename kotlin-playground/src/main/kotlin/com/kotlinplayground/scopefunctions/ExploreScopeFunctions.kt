package org.example.com.kotlinplayground.scopefunctions

import org.example.com.kotlinplayground.classes.Course
import org.example.com.kotlinplayground.classes.CourseCategory

fun main() {

    //exploreApply()
    //exploreAlso()
    exploreLet()
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        it.sum()
    }
    println(result)
}

fun exploreApply() {

    val course = Course(
        id = 1,
        name = "Design Thinking in Kotlin",
        author = "Dilip"
    ).apply { this
        courseCategory = CourseCategory.DESIGN
        //this.courseCategory = CourseCategory.DESIGN
    }

    println("Course : $course")
}

fun exploreAlso() {

    val course = Course(
        id = 1,
        name = "Design Thinking in Kotlin",
        author = "Dilip"
    ).apply { this
        courseCategory = CourseCategory.DESIGN
        //this.courseCategory = CourseCategory.DESIGN
    }.also {
        //it.courseCategory = CourseCategory.DESIGN
        println("Course is $it")
    }

}
