package com.example.dsa.interviewquestions.countingelements

import kotlin.math.max

fun main(){
val arr = arrayOf(6)

  for (i in MaxCounters().solution(5,arr)){
      print("$i ")
  }

}

class MaxCounters {

         fun solution(n : Int , arr : Array<Int>) : IntArray{
            val answerArray = IntArray(n){0}
             var maxValue = 0
             var minValue = 0
            for (x in arr){
                val i = x
                     if (i in 1 until n){
                     answerArray[i-1] = max(answerArray[i-1]+1 , minValue+1)
                         maxValue = max(answerArray[i-1],maxValue)
                     }else if (i==n+1){
                         minValue = maxValue
                     }
            }
             for (j in answerArray){
                 answerArray[j] = max(answerArray[j],minValue)
             }
            return answerArray

        }

}