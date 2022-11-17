package com.example.dsa.leetcodeproblems.easy

fun main(){
    var n = 49
    var numSum = 0
    while (n>0){
        val d = n % 10
        n /= 10
        numSum += d * d
    }
    println(numSum)
}
