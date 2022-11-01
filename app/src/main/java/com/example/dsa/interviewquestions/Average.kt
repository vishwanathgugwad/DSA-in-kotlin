package com.example.dsa.arrays



fun main() {

    print("enter the number of days : ")
    val numOfDays = readLine()!!
    var sum = 0


    for (i in 1..numOfDays.toInt()) {
        println("day $i high temp = ")
        val dayTemp = readLine()!!
        sum += dayTemp.toInt()
    }
    val average = sum / numOfDays.toInt()
    println("The average temp of $numOfDays days is $average Deg ")
}
