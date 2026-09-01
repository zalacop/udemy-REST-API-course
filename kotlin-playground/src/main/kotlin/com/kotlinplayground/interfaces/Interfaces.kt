package org.example.com.kotlinplayground.interfaces

import org.example.com.kotlinplayground.classes.Course

interface CourseRepository {

    fun getById(id: Int): Course

    fun save(course: Course) : Int {

        println("Course : $course")
        return course.id
    }
}

interface Repository {

    fun getAll(): Any
}

class SqlCourseRepository : CourseRepository, Repository {
    override fun getById(id: Int): Course {
        return Course(id,
            name = "Reactive Programming in modern Java using Project reactor",
            author = "Alice")
    }

    override fun getAll(): Any {
        return 8
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id,
            name = "Reactive Programming in modern Java using Project reactor",
            author = "Alice")
    }

    override fun save(course: Course): Int {
        println("Course in NoSqlCourseRepository : $course")
        return course.id
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
    val savedCourseId = noSqlCourseRepository.save(Course(id = 6,
        name = "Reactive Programming in modern Java using Project reactor",
        author = "Alice"))
    println("Saved course Id in noSqlCourseRepository is $savedCourseId")
}