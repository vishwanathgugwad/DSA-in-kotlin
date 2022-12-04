package com.example.dsa.sorting

class InsertionSort {

    fun sort(arr : Array<Int>){
        for (i in arr.indices){
            for (j in i downTo 0){
                if (j > 0 && arr[j] < arr[j-1]){
                    val temp = arr[j]
                    arr[j] = arr[j-1]
                    arr[j-1] = temp
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

    val insertionSOrt = InsertionSort()
    val arr = arrayOf(10,3,2,5,8,4,1)
    insertionSOrt.sort(arr)
    insertionSOrt.sortedArray(arr)
}