package com.mbialowas.abstractClass

/*
 abstract classes can't be instatiated, but dervied classes can be
 */
abstract class Person {
    var age: Int = 21

    fun displayAge(){
        println("His age is : $age")
    }
    abstract fun displayGreeting() // abstract function has no body
}