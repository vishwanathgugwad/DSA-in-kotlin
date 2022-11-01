package com.example.dsa.interviewquestions

//This is to demonstrate  method execution in stack memory.
//stack memory is used by the system to make recursive calls
class StackMemory {

    fun first(){
        second()
        println("iam the first")
    } fun second(){
        third()
        println("iam the second")
    } fun third(){
        fourth()
        println("iam the third")
    }fun fourth(){
        println("iam the fourth")
    }

}

fun main(){
    val stackMemory = StackMemory()
    stackMemory.first()
}