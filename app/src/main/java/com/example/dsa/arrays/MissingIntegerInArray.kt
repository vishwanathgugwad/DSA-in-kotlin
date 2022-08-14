package com.example.dsa.arrays


fun main(){

    val arr = arrayOf(1,2,3,4,5,7,8,9,10)
    missingInt(arr)

}


fun missingInt(arr : Array<Int>){

    var sum = 0
    var sum1 = 0
    for (i in arr.indices){
        sum += arr[i]
    }
    sum1 = (10 * (10+1))/2
    val num =sum1 - sum
    return println("missing number is $num")

}