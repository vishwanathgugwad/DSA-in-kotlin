package com.example.dsa.interviewquestions.prefixsums

import java.util.*
import kotlin.math.round


fun main(){
val arr = arrayOf(10, 10, -1, 2, 4, -1, 2, -1)
    println(MinAvgTwoSlice.solution(arr))
}


class MinAvgTwoSlice{

    companion object{
        fun solution(arr : Array<Int>) : Int{

            var sumOfTwo = Int.MAX_VALUE
            var sumOfThree = Int.MAX_VALUE
            var indexOfTwo = -1
            var indexOfThree = -1

            for (i in arr.indices){
               if (i<=arr.size-2){
                   val sum2 = arr[i] + arr[i+1]
                   if (sum2<sumOfTwo){
                       sumOfTwo = sum2
                       indexOfTwo = i
                   }
               }
                if (i<=arr.size-3){
                    val sum3 = arr[i]+arr[i+1]+arr[i+2]
                    if (sum3<sumOfThree){
                        sumOfThree = sum3
                        indexOfThree = i
                    }
                }
            }
            if (indexOfThree == -1){
                return indexOfTwo
            }

            val avg2 = sumOfTwo.toDouble()/2
            val avg3 = sumOfThree.toDouble()/3
            if (avg2<avg3){
                return indexOfTwo
            }
            if (avg3<avg2){
                return indexOfThree
            }
            return minOf(indexOfThree,indexOfTwo)

        }
    }
}