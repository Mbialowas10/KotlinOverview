package com.mbialowas.demo3

/*
 show class how to access attributes and functions before showcasting constructor
 */

// open keyword used otherwise other classes can't inherit from base class Animal
open class Animal(
    // primary constructor
    var name:String,
    var sound:String ="Hello Greeting" // default value assigned
) {

    // secondary constructor - not as common
    // constructor(name: String, sound:String){}


    // init gets called when class is initialized ie. when object is created
    init {
        println("$name makes $sound sound")
    }
    // attributes aka property - these become variables of the class

    // eg. mammals, birds, fish, reptiles, etc...
    //var type: String? = null
    //var sound:String? = null

    // constructor goes here...


    // methods - functions that belong to class
    fun makeSound():String{
        return "$name makes the follow noise: $sound"
    }
}