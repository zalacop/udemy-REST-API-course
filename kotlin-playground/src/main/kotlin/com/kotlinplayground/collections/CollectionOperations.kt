package org.example.com.kotlinplayground.collections

import org.example.com.kotlinplayground.dataset.Course
import org.example.com.kotlinplayground.dataset.CourseCategory
import org.example.com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

    val mapResult = list.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("Map Result : $mapResult")

    val flatMapResult = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }

    println("FlatMap Result : $flatMapResult")

    //exploreFilter(courseList, desPredicate)
    //exploreMap(courseList, devPredicate)
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
