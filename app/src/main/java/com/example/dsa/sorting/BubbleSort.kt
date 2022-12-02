package com.example.dsa.sorting

class BubbleSort {


val n = 10
    fun sort(arr : Array<Int>){
        val n = arr.size
        for (i in 0 until n-1){
            for (j in 0 until  n-i-1){
                if (arr[j] > arr[j+1]){
                    var temp = arr[j+1]
                    arr[j+1] = arr[j]
                    arr[j] = temp
                }
            }
        }
    }

    fun sortedArray(arr : Array<Int>){
        for (element in arr){
            print("$element ")
        }
    }
}

fun main(){
    val bubble = BubbleSort()
    var arr = arrayOf(10,5,30,15,50,6)
    //arr.sort()
    bubble.sort(arr)
    bubble.sortedArray(arr)

}