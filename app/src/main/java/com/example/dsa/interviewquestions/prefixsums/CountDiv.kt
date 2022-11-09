package com.example.dsa.interviewquestions.prefixsums


import kotlin.math.roundToInt

fun main(){
println(CountDiv.solution(0,1,11))
}

class CountDiv {
    companion object{
        fun solution(a : Int,b : Int,k : Int) : Int{
            var count = 0
            if (a<=b) {
             count = ((b-a).toDouble()/k).roundToInt()
            }
            return count
        }
    }
}