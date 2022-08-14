package com.example.dsa.arrays



fun main(){
    val arr1 = arrayOf(1,2,3,4,5)
    val arr2 = arrayOf(2,3,1,5,4)

    println(isPermutation(arr1,arr2))
}

fun isPermutation(arr1 : Array<Int> , arr2 : Array<Int>): Boolean {
    var sum1 = 0
    var sum2 = 0
    var mul1 = 1
    var mul2 = 1
    if (arr1.size != arr2.size){
        return false
    }

    for (i in arr1.indices){
            sum1 += arr1[i]
            mul1 *= arr1[i]
            sum2 += arr2[i]
            mul2 *= arr2[i]
    }

    if (sum1 == sum2 && mul1 == mul2){
        return true
    }
    return false


}