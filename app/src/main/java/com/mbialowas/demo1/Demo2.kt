package com.mbialowas.demo1

// Some Function Information

fun main(){

    /*
     functions are fun
     they consume values and sometimes return something
     */
    print("Hello I'm a function without an newline")
    println()
    println(addNumbers())
    println(newAndImprovedAddNumbers(5,15))
    println(newAndImprovedAddNumbersV2(2,3))


}

// note this function is not consuming any values, but it is returning an Int
fun addNumbers():Int{
    return 80+6
}
// semi-colons are optional
fun newAndImprovedAddNumbers(a:Int, b:Int):Int{
    return a + b
}

// short-hand notation when returning values
fun newAndImprovedAddNumbersV2(a:Int, b:Int) = (a+b)