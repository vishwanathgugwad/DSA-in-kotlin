package com.example.dsa.interviewquestions.timecomplexity

import kotlin.math.abs
import kotlin.math.max


fun main(){
    println(TapeEquilibrium.findMinDiff(arrayOf(-100,100)))
}


class TapeEquilibrium{
    companion object{
        fun findMinDiff(arr : Array<Int>) : Int {
         var valuesOnLeft = 0
         for (element in arr){
             valuesOnLeft += element
         }
          var minDif = Int.MAX_VALUE
            var valuesOnRight = 0
            for (j in 0 until arr.size-1){
                valuesOnLeft -= arr[j]
                valuesOnRight += arr[j]
                if (abs(valuesOnLeft - valuesOnRight) < minDif){
                    minDif = abs(valuesOnLeft - valuesOnRight)
                }
            }
            return minDif
        }
    }
}