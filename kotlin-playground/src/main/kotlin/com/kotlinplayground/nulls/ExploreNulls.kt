package org.example.com.kotlinplayground.nulls


data class Movie(
    val id: Int?,
    val name: String
)

fun main() {

    var nameNullable : String? = null

    println("Value is : ${nameNullable?.length}") //safe operator -> ?

    /*if (nameNullable != null) {
    println("Value is : ${nameNullable.length}")
}
*/

    nameNullable = "Alex"
    //val length = nameNullable?.length?.toLong() ?: 0 //elvis operator -> ?:
    val length = nameNullable.length.toLong()
    println("Length is $length")

    nameNullable = "Zala"
    println("Value is : $nameNullable")

    var name : String = "Zala"

    val movie = Movie(null, name = "Avengers")
    val savedMovie = saveMovie(movie)
    println(savedMovie.id!!) //non null assertion -> !!
    println("Saved movie : $savedMovie")

}

fun saveMovie(movie: Movie) : Movie {

    //return movie.copy(id = 1)
    return movie
}
