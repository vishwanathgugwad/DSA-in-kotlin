package com.example.dsa.interviewquestions.prefixsums

import kotlin.math.abs


fun main(){
    println(PassingCars.solution(arrayOf(0,1,0,1,1)))
    abs(-1000000000/2)
}

class PassingCars{
    companion object{
        fun solution(array: Array<Int>) : Int{
            var eastMovingCars = 0
            var passingCars = 0
            for (i in array){
                if (i == 0){
                    eastMovingCars++
                }else{
                    passingCars+=eastMovingCars
                }
            }
            return if (abs(passingCars) > 1000000000) -1 else passingCars
        }
    }
}