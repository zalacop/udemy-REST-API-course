package org.example.com.kotlinplayground.collections

import org.example.com.kotlinplayground.dataset.Course
import org.example.com.kotlinplayground.dataset.CourseCategory
import org.example.com.kotlinplayground.dataset.KAFKA
import org.example.com.kotlinplayground.dataset.courseList
import org.example.com.kotlinplayground.functions.courseName

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val desPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

 /*   val list = listOf(listOf(1, 2, 3), listOf(4, 5, 6))

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

    val course = exploreFlatMap(courseList, KAFKA)
    println("Courses : $course")*/

    //exploreHasMap()
    collections_nullability()
}

fun collections_nullability() {

    var list : MutableList<String>? = null
    list = mutableListOf()
    list.add("Zala")
    list.forEach {
        println("Value is : $$it")
    }

    val list1 : List<String?> = listOf("Adam", null, "Alex")
    list1.forEach {
        println("Value length is : ${it?.length}")
    }

}

fun exploreHasMap() {

    val nameAgeMutableMap = mutableMapOf("Zala" to 33, "Scooby" to 5)
    nameAgeMutableMap
        .forEach { (k, v) ->
            println("Key : $k and value is $v")
        }

    val value = nameAgeMutableMap.getOrElse("Zala1") {"abc"}
    println("Value is $value")

    val result = nameAgeMutableMap.contains("abc")
    println("Result is $result")

    val filteredMap =  nameAgeMutableMap.filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap is $filteredMap")

    val maxAge = nameAgeMutableMap
        .maxByOrNull { it.value }

    println("Max Age is $maxAge")
}

fun exploreFlatMap(
    courseList: MutableList<Course>,
    kafka: String
): List<String> {

    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }

    return kafkaCourses
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
