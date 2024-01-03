package com.mbialowas.hof

// literals or aka as assigned values

// var x = 10
// var y = 5

// 10 and 5 are literal values

/*
 when a function is assigned to a variable it becomes
 a function literal; kotlin supports 2 types:
    1. lambda expression- a short version
    2. anonymous function

 */

// typical function below
/*
    fun name(): return type {
        body
        return statement
     }
 */

//regular function
fun multipleTwoNum(x:Int, y:Int): Int{
    return x + y
}

// lambda expression, note function has no name
var add = { x:Int, y:Int -> x + y}
fun main(){
    // calling a lambda
    //val print = { println(add(2,3))}
    //print()
    //print.invoke()

    // call addNum()
    print(addNum(1,3))
    println()
    addNum2(1,3)
    println(message())

    message0()


    // sometimes not neccessary to assign fucntion to variable
    println({a:Int,b:Int -> a + b}(2,3))
}

// val lambda: (DT1,DT2)->Return Type ={ variable1:DT1, variable2:DT2)-> mehodBody }
/*
    addTwoNum is variable name
    () represents parameters passed in to function
    -> Int is return type
    {} lambda is function body
 */
val addTwoNum:(Int,Int)->Int={a:Int,b:Int -> a+b} // seems long

val addtwoNum = { a: Int, b: Int -> a +b }

// types

// callback: (result:String)-> Unit

// type 0 - with parameters and return value
val addNum:(Int,Int) -> Int = {a:Int,b:Int -> a+b}

// type 1 - with parameters no return value
val addNum2: (Int, Int) -> Unit = {a:Int,b:Int -> println(a+b) } // unit is same as void in java

// type 2 - no parameters, but return a value
val message: () -> String = {"Hello Class"}

// type 3 - no parameter no return value
val message0: () -> Unit = {println("Hi Class")}








