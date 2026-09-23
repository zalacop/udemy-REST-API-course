package org.example.com.kotlinplayground.collections

import org.example.com.kotlinplayground.dataset.Course
import org.example.com.kotlinplayground.dataset.CourseCategory
import org.example.com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    //exploreFilter(courseList, desPredicate)
    exploreMap(courseList, desPredicate)
}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {

    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
        .forEach {
            println(it)
        }
    println("Courses : $courses")
}

fun exploreFilter(courseList: MutableList<Course>,
                  predicate: (Course) -> Boolean) {

    val developmentCourses = courseList
        /*.filter { it.category == CourseCategory.DEVELOPEMENT }*/
        .filter { predicate.invoke(it) }
        .forEach {
            println("devCourses : $it")
        }
    
}
