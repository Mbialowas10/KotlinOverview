package com.mbialowas.hof

// anonymous fx - function without name
val addNumbers = fun(a:Int,b:Int):Int {
    return a+b
}
/*
 try below by uncommenting an running, why does this work? A: because body made up of single statement
val addNumbers = fun(a:Int,b:Int):Int {a+b}
 */



fun main(){
    println(addNumbers(2,3))
}