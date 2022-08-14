package com.example.dsa.arrays

var a = ""

fun main(){

    var arr = arrayOf(20,30,50,60,10)
    var max = 0
    var secondMax = 0

    for (i in arr){
        if(i > max){
            secondMax = max
            max = i
        }
    }
    println(" max is $max second max is $secondMax")
}


