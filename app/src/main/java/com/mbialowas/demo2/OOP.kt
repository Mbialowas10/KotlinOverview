package com.mbialowas.demo2

// OOP

fun main(){

    // note filename doesn't make class name, probably should be the same
    var shark = Animal("Shark", "Chomp")
    var monkey = Animal("Monkey", "Chirp")
    // set values of shark type
    //shark.type = "Shark"
    //shark.sound = "chomp"

    println(shark.makeSound())
    println(monkey.makeSound())

    // let's now create a primary constructor inside the Animal class
}