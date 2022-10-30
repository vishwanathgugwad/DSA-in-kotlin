package com.example.dsa.interviewquestions

fun main(){
    println(BinaryGap.solution(10))
}

class BinaryGap{

    companion object{
        fun solution(n :Int) : Int{

            var started  = false
            var count  = 0
            var maxCount  = 0
            val  bStr = Integer.toBinaryString(n)
            for (i in bStr){
                if (i.equals('1')){
                    if (started){
                        if (count > maxCount){
                            maxCount = count
                        }
                    }
                    count = 0
                    started = true
                }
                if (i.equals('0')){
                    if(started){
                        count++
                    }
                }

            }
            return maxCount

        }
    }
}