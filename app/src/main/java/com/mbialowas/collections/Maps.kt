package com.mbialowas.collections


/*
    maps store key value pairs, helpful when dealing with APIs
    like a dictionary or hash
 */

fun main(){

    var iMap = mapOf(
        1 to "http://www.cnn.com",
        2 to "http://www.rrc.ca",
        3 to "http://kotlin.org"
    )

    for (key in iMap.keys){
        println(iMap[key])
    }

    print(iMap[2])
    println("++++++Testing++++++")

    for (key in iMap){
        println(key)
    }

    var mMap = mutableMapOf<Int,String>(
        1 to "Michael bialowas",
        2 to "Kotlin",
        3 to "Happy new year!"
    )

    mMap.put(5,"Maverick")

    for (item in mMap){
        print(item.key)
        println(" ->  ${item.value}")
    }




}




