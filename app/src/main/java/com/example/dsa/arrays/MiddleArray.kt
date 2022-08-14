package com.example.dsa




fun main(){
val arr = arrayOf(1,2,3,4,5)
    val result = (middle(arr))
    println(result.contentToString())
}

fun middle(arr : Array<Int>): Array<Int> {
    return arr.copyOfRange(1 , (arr.size - 1))
}