package com.example.dsa.interviewquestions

import java.util.*


fun main(){
    var arr = arrayOf(9,3,9,3,9,7,9)
    println(OddOccurrencesInArray.findOddOccurrence(arr))
}

class OddOccurrencesInArray{


    companion object{

        fun findOddOccurrence( arr : Array<Int>) : Int{
            val hashSet = hashSetOf<Int>()
            if (arr.isNotEmpty()){
                for (i in arr.indices){
                    if (hashSet.contains(arr[i])){
                        hashSet.remove(arr[i])
                    }else{
                        hashSet.add(arr[i])
                    }
                }
            }
            return hashSet.iterator().next()
        }
    }
}