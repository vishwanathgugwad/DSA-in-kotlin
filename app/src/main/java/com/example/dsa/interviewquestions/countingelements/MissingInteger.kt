package com.example.dsa.interviewquestions.countingelements

fun main(){
    println(MissingInteger.missingInt(array = arrayOf(1,2,3)))
}

class MissingInteger {

    companion object{

        fun missingInt(array: Array<Int>):Int{

            val list = hashSetOf<Int>()
            for (i in 1 .. array.size+1){
                    list.add(i)
            }
            for (j in array){
                (list.remove(j))
            }
            return list.iterator().next()
         }

    }
}