package com.mbialowas.demo4

class Person {
    var name: String = "Michael Bialowas"


    // equivalent to
    get() = field // getter
    set(value) {field = value} // setter

}
fun main(){
    var p1 = Person()
    println(p1.name)

    p1.name = "Mike" // makes use of setter
    println(p1.name)
}