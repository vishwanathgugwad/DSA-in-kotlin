package com.example.dsa




fun main(){
    val arr = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    var sum = 0
    for (i in arr.indices)
        sum += arr[i][i]
    println(sum)
}