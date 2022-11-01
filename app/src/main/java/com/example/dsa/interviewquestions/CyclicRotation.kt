package com.example.dsa.interviewquestions


fun main(){
    val arr = arrayOf(3,8,9,7,6)
    val rotatedArr = CyclicRotation.rotate(arr,3)
    for (i in rotatedArr){
        println(i)
    }
}

class CyclicRotation{
    companion object {
        fun rotate(arr: Array<Int>, k: Int): Array<Int> {
           if (arr.isNotEmpty()){
               for (i in 0 until k) {
                   var lastValue = arr[arr.size - 1]
                   for (j in (arr.size -2) downTo 0) {
                       arr[j + 1] = arr[j]
                   }
                   arr[0] = lastValue
               }
           }
            return arr
        }
    }
    }

