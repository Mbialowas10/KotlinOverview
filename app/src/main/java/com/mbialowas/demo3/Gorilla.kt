package com.mbialowas.demo3

class Gorilla(name:String, sound:String): Animal(name,sound) {

    init{
        println("$name makes $sound sound.")
    }
    fun jump(){
        "$name is jumping"
    }
}