package org.example.com.kotlinplayground.collections

import org.example.com.kotlinplayground.dataset.Course
import org.example.com.kotlinplayground.dataset.CourseCategory
import org.example.com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    exploreFilter(courseList)
}

fun exploreFilter(courseList: MutableList<Course>) {

    val developmentCourses = courseList
        .filter { it.category == CourseCategory.DEVELOPEMENT }

    println("Development courses : $developmentCourses")
}
