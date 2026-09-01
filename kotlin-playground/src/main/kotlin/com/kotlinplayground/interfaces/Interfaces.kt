package org.example.com.kotlinplayground.interfaces

import org.example.com.kotlinplayground.classes.Course

interface CourseRepository {

    fun getById(id: Int): Course

}

class SqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id,
            name = "Reactive Programming in modern Java using Project reactor",
            author = "Alice")
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id,
            name = "Reactive Programming in modern Java using Project reactor",
            author = "Alice")
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(id = 1)
    println("Course is $course")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(id = 2)
    println("Course is $course1")
}