package com.example.dsa.interviewquestions.timecomplexity

import kotlin.math.ceil


fun main(){
    println(FrogJmp.calculateJmp(10,85,30))
}

class FrogJmp{
    
    companion object{
        
        fun calculateJmp(x: Int , y : Int , d : Int) : Int{
            return if (x<y){
                val distance = y - x ;
                ceil((distance /d.toDouble())).toInt();
            }else{
                0
            }

        }

    }
}