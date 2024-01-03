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
    val print = { println(add(2,3))}
    print()
    print.invoke()
}

// val lambda: (DT1,DT2)->Return Type ={ variable1:DT1, variable2:DT2)-> mehodBody }
// 2:55 54. lambda exp
val addTwoNum:(Int,Int)->Int={a:Int,b:Int -> a+b}


