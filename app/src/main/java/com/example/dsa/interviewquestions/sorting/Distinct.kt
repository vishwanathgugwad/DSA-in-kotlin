package com.example.dsa.interviewquestions.sorting

fun main(){
    val arr = arrayOf(2)
    println(Distinct.solution(arr))
}



class Distinct{

    companion object{

        fun solution(arr : Array<Int>) : Int{
            return arr.toHashSet().size
        }
    }
}