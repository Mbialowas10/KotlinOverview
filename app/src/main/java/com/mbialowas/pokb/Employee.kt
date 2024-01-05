package com.mbialowas.pokb

data class Employee(
    var name:String,
    val title:String,
    val salary:Number
)


fun main(){
    var mike = Employee("Mike Bialowas", "Instructor", 10.0)
    println(mike.name)
    mike.name = "Michael"
    println(mike.name)

    var name:String = "Hello"

    message("Hello Cong!!")
}
