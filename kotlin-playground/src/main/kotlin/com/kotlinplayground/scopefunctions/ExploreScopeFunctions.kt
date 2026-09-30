package org.example.com.kotlinplayground.scopefunctions

import org.example.com.kotlinplayground.classes.Course
import org.example.com.kotlinplayground.classes.CourseCategory

fun main() {

    //exploreApply()
    exploreAlso()
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
