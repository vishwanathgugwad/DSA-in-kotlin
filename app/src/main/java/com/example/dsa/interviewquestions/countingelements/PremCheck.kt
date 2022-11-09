package com.example.dsa.interviewquestions.countingelements

fun main(){
println(PremCheck.premCheck(arrayOf(4,1,3,2)))
}

class PremCheck {
    companion object{
        fun premCheck(array: Array<Int>):Int{
            val set = hashSetOf<Int>()
            for (i in 1 .. array.size){
                set.add(i)
            }
            for (j in array){
                if (!set.contains(j)){
                    return 0
                }else{
                    set.remove(j)
                }
            }
            return if (set.isEmpty()) 1 else 0
        }
    }
}