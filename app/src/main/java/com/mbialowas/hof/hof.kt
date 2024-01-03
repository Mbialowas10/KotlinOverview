package com.mbialowas.hof

// higher order function - hof
// consume a function as a parameter or returns a function or both
// lambda expression are passed as arguments/parameters

fun main(){
    val sub = {a:Int,b:Int -> a-b}
    hof(sub)

    // alternatively you can pass lambda directly to hof, be sure to comment 8 and 9
    //hof({a:Int,b:Int -> a-b})

    // if last parameter is lambda can include 2nd parameter outside of ()
    //hof{a:Int,b:Int -> a-b}

    // it in this context refers to parameter that gets passed to function
//    message{
//        "Hello Class, Welcome!"
//        print(it)
//    }

    // capitalize a string
    capitalizeString("michael", { s-> s.toUpperCase() })
    // wait we can use it instead of s because we handle one parameter inside on lambda
    capitalizeString("charlene"){it.toUpperCase()} // it can replace single parameter in lambda
}

fun hof(subtraction: (Int,Int)-> Int){
    val result = subtraction(6,4) // this is a way to invoke function within hof function
    println(result)
}

fun message(name:(String)-> Unit){
    println(name)
}

fun capitalizeString(str: String, fn:(String) -> String){
    var result = fn(str)
    println(result)
}



