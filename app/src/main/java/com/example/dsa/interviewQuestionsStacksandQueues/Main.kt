package com.example.dsa.interviewQuestionsStacksandQueues

fun main(){

    var threeInOne = ThreeInOne(3)
    threeInOne.push(0,10)
    threeInOne.push(0,20)
    threeInOne.push(1,30)
    threeInOne.push(1,40)
    println(threeInOne.peek(2))


}