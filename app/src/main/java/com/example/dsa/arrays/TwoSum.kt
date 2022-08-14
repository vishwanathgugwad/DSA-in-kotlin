package com.example.dsa.arrays

//find all the pair  of integer whose sum is equal to a given number

fun main(){

    val arr = arrayOf(2,11,15,7)
    val target = 264
    var outArr = Array<Int>(2){0}


    for (i in arr.indices){
        for (j in 1 until arr.size){
            if (arr[i] + arr[j] == target){
                println(arrayOf(i,j).contentToString())
                return
//                 println(" pair = ${arr[i]} , ${arr[j]}")
//                return
            }
        }

    }
    throw IllegalArgumentException("no solutions found")
}