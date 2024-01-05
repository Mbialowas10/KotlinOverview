package com.mbialowas.collections

// set is a collection of unorder unique values

fun main(){

    // notice no generic type defined <> on setOf we are able to mix types String and number
    var set = setOf(10,33,2,24,5,7,"Mike","New Year",5)

    for (item in set){
        println(item)
    }
    println("++++++++++")
    // mutable set
    var set2 = mutableSetOf("Hello",2,"Class","Class")

    for (item in set2){
        println(item)
    }
    println("++++++ ++++")
    set2.add("Bob")

    for (item in set2){
        println(item)
    }
}