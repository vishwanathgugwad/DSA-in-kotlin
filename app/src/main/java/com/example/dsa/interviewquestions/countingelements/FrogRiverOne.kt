package com.example.dsa.interviewquestions.countingelements


fun main(){
println(FrogRiverOne.findPath(arrayOf(1,3,1,4,2,3,5,4),5))
}

class FrogRiverOne{

    companion object{
        fun findPath(arr : Array<Int>,x : Int) : Int{
            val set = hashSetOf<Int>()
            for (i in 1..x){
                set.add(i)
            }
            for (j in  0 until arr.size-1){
                if (set.remove(arr[j])){
                    if (set.isEmpty()){
                        return j
                    }
                }
            }
            return  -1
        }
    }
}