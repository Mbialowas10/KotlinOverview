package com.mbialowas.demo3

class Shark(name:String, sound:String): Animal(name,sound) {

    init{
       println("$name doesn't make a sound sorry." )
    }
    fun swim(){
        println("$name is swimming. Look out Nemo!")
    }
}