package com.mbialowas.demo3

/*
 Inheritance
 why?
 It's a easy way to re-use code
 Follows DRY principle, ie. don't repeat yourself
 */
fun main(){

    val person = Animal("Human") // note no second parameter passed in


    val bird = Bird("Blue jay", "Chirp")
    bird.fly()

    val gorilla = Gorilla("gorilla", "Yum")
    gorilla.jump()

    val shark = Shark("Great white", "no sound")
    shark.swim()
}

