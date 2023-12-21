package com.mbialowas.demo2

/*
 show class how to access attributes and functions before showcasting constructor
 */

class Animal(
    var type:String,
    var sound:String
) {

    // attributes aka property - these become variables of the class

    // eg. mammals, birds, fish, reptiles, etc...
    //var type: String? = null
    //var sound:String? = null

    // constructor goes here...


    // methods - functions that belong to class
    fun makeSound():String{
        return "$type makes the follow noise: $sound"
    }
}