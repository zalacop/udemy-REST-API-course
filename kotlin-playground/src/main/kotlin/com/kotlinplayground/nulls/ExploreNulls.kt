package org.example.com.kotlinplayground.nulls


data class Movie(
    val id: Int?,
    val name: String
)

fun main() {

    var nameNullable : String? = null

    println("Value is : ${nameNullable?.length}")

    /*if (nameNullable != null) {
        println("Value is : ${nameNullable.length}")
    }
*/
    nameNullable = "Zala"
    println("Value is : $nameNullable")

    var name : String = "Zala"

    val movie = Movie(null, name = "Avengers")
    val savedMovie = saveMovie(movie)
    println("Saved movie : $savedMovie")

}

fun saveMovie(movie: Movie) : Movie {

    return movie.copy(id = 1)
}
