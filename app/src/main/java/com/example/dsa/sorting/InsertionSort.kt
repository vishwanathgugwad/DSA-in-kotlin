package com.example.dsa.sorting

class InsertionSort {

    fun sort(arr : Array<Int>){
        var temp : Int
        for (i in 1 until arr.size){
            temp = arr[i]
            var j = i
            while (j>0 && arr[j-1] > temp){
                arr[j] = arr[j-1]
                j--
            }
            arr[j] = temp
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