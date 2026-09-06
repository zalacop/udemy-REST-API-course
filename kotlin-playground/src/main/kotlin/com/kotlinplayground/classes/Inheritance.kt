package org.example.com.kotlinplayground.classes

open class User(val name: String) {

    open var isLoggedIn: Boolean = false
    open fun login() {
        println("Inside user login")
    }

    private fun secret() {        // This marks the function or variable accessible only to that specific class
        println("Inside user login")
    }

    protected open fun logout() {        //A protected member is visible in the class and subclasses
        println("Inside user logout")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = false

    companion object{
        const val noOfEnrolledCourses = 10
        fun country() = "Norway"
    }
    override fun login() {
        println("Inside student login")
        super.login()
    }

    public override fun logout() {          //This is the default access modifier 
        super.logout()
        println("Inside student logout")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Zala")
    println("Name is: ${student.name}")
    student.logout()
    student.isLoggedIn = true
    println("Logged in value is: ${student.isLoggedIn}")

    val country = Student.country()
    println("Country is: $country")
    println("noOfEnrolledCourses is : ${Student.noOfEnrolledCourses}")

    val instructor = Instructor("Dilip")
    println("Name is: ${instructor.name}")
    instructor.login()

    val user = User("Dilip")
}