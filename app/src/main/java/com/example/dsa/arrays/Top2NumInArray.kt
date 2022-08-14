package com.example.dsa.arrays



fun main(){

    var arr = arrayOf(84,90,65,3,2,1,0,84,80,74,100)
     arr.sortDescending()

    val first = arr[0]
    var second = 0
    //if repeated elements in array

    for (i in arr.indices){
        if (arr[i] != first) {
            second = arr[i]
            break
        }
    }
    println(" first $first  second $second")


}