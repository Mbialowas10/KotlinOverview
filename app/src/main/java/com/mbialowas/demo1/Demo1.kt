package com.mbialowas.demo1

/*
 Some speaking notes
 released in 2016 by JetBrains
 Use Cases: Mobile Dev, full-stack, multipurpose language
 Concise and safe
 */


// Kotlin Introduction


// fun keyword is used to denote a function, a piece of re-usable code
fun main(){
    println("Hello Class") // println is used to output values to console
    println(100-14)

    // single line comment

    /*
        multiline comment
        comments are ignored by kotlin complier,like in other lanaguages
     */

    // variables usage
    // val is read-only
    // var is mutable

    //val variableName = value
    //var variableName = value

    var name = "Michael Bialowas"
    val dob = "August 5"

    println("Hi " + name + " my birthday is ${dob}") // ${} denotes string intrapolation and + for concatenation


    var game1: String
    game1 = "Super Mario Wonder"

    // kotlin can infer types, real cool
    val game2 = "Zelda"

    val PI = 3.14

    println(game1)
    println(game2)
    println(PI)

    // datatype - can be inferred by value
    /*
        Primitive
            -Integer, Double, Character, Boolean
        Non-Primitive
            -String, Array Classes
     */




} // END Main





