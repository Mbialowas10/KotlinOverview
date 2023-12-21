package com.mbialowas.demo3

class Bird(name: String,sound:String) : Animal(name, sound) {

    init{
        println("$name makes $sound sound")
    }
    fun fly(){
        println("$name is flying!")
    }
}