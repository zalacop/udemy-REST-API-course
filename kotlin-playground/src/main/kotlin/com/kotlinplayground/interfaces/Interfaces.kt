package org.example.com.kotlinplayground.interfaces

import org.example.com.kotlinplayground.classes.Course

interface CourseRepository {

    fun getById(id: Int): Course

    fun save(course: Course) : Int {

        println("Course : $course")
        return course.id
    }

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
    val courseId = sqlCourseRepository.save(Course(id = 5,
        name = "Reactive Programming in modern Java using Project reactor",
        author = "Alice"))
    println("Saved course Id is $courseId")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(id = 2)
    println("Course is $course1")
}