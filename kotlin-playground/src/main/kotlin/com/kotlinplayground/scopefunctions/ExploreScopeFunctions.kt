package org.example.com.kotlinplayground.scopefunctions

import org.example.com.kotlinplayground.classes.Course
import org.example.com.kotlinplayground.classes.CourseCategory

fun main() {

    exploreApply()
}

fun exploreApply() {

    val course = Course(
        id = 1,
        name = "Design Thinking in Kotlin",
        author = "Dilip"
    ).apply {
        this.courseCategory = CourseCategory.DESIGN
    }

    println("Course : $course")
}
