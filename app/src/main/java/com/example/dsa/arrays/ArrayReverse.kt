package com.example.dsa


fun reverse(arr : Array<Int>): String {
    for (i in arr){
        val fromLast = arr.size-i-1
        val temp = arr[i]
        arr[i] = arr[fromLast]
        arr[fromLast] = temp
    }
    return arr.contentToString()
}

fun main(){
    val arr = arrayOf(1,2,3,4)
    println(reverse(arr))
}