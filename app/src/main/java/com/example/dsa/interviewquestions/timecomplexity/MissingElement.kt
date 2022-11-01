package com.example.dsa.interviewquestions.timecomplexity

fun main(){
    val arr = arrayOf(2,3,1,5)
println(MissingElement.missingElem(arr))
}

class MissingElement {
    companion object{
        fun missingElem(arr: Array<Int>):Int{
           val set = hashSetOf<Int>()
            for (i in 1..arr.size+1){
                set.add(i)
            }
            for (j in arr.indices){
                set.remove(arr[j])
            }
            return set.iterator().next()
        }
    }
}