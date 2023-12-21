package com.mbialowas.demo6

class Outer {

    var num = 10

    // nested class
    class Inner{
        //
        var name="Michael"
    }
}

fun main(){
    var outer = Outer()
    println(outer.num)

    var inner = Outer.Inner()
    println(inner.name)
}