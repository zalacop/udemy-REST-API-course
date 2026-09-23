package org.example.com.kotlinplayground.collections

import org.example.com.kotlinplayground.dataset.Course
import org.example.com.kotlinplayground.dataset.CourseCategory
import org.example.com.kotlinplayground.dataset.courseList

fun main() {

    val namesListUsingSequence = listOf("alice", "bob", "charlie")
        .asSequence()
        .filter { it.length >= 4 }
        .map { it.uppercase() }
        .toList()

    println("Names list using sequences : $namesListUsingSequence")
    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }

    exploreFilterUsingSequence(courseList(), devPredicate)

    val range = 1 .. 1000000000

    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach {
            println("Value is : $it")
        }
}

fun exploreFilterUsingSequence(courseList: MutableList<Course>,
                  predicate: (Course) -> Boolean) {

    val developmentCourses = courseList
        /*.filter { it.category == CourseCategory.DEVELOPEMENT }*/
        .asSequence()
        .filter { predicate.invoke(it) }
        .forEach {
            println("devCourses : $it")
        }

}