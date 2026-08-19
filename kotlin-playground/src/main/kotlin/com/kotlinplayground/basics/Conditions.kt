package org.example.com.kotlinplayground.basics

fun main() {
    //if-else is an expression. Expression always evaluate to a result
    //when block allows us to write concise and expressive code when dealing with multiple conditions

    var name = "Anders"
    name = "Chloe"

    val result = if (name.length  == 4) {
        println("Name is four characters")
        name
    } else{
        println("Name is not four characters")
        name
    }

    println("result : $result")

    //1 -> GOLD, 2 -> SILVER, 3 -> BRONZE

    var position = 1
    position = 4

    /* val medal = if( position == 1 ) {
        "GOLD"
    } else if (position == 2) {
        "SILVER"
    } else if (position == 3) {
        "BRONZE"
    } else {
        "NO MEDAL"
    }*/

    val medal = when (position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)

}