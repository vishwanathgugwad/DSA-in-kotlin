package com.example.dsa.arrays

//kotlin program to find the number of days above average temperature in an array

fun main() {

    print("enter the number of days : ")
    val numOfDays = readLine()!!.toInt()
    val arr = Array(numOfDays){0}
    var sum = 0
    var i =1


    for (i in 0 until numOfDays) {
        println("day ${i+1} high temp = ")
        arr[i] = readLine()!!.toInt()
        sum += arr[i]

    }
    val average = sum / numOfDays
    var above = 0
    for (element in arr){
        if (element > average )
            above++
    }
    println("The average temp of $numOfDays days is $average Deg ")
    println("The number of days above temperature are $above ")
}