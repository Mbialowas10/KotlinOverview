package com.mbialowas.collections



fun main() {
    /*
    Lists - ordered collection using indices
    two types: immutable and mutable list
     */

    // read only list defined
    val list = listOf<String>("hello", "class", "Happy", "New", "Year")

    for (item in list) {
        println(item)
    }

    // no add method avaialbe on immutable aka read only list

    // mutable list - writable list
    var list2 = mutableListOf<String>("Mike","was","here","on")

    for(item in list2){
        println(item)
    }
    println("================")
    list2.add("Dec 20,2023")
    for(item in list2){
        println(item)
    }
}



