package com.example.dsa.sorting

class SelectionSort {

    fun sort(arr :Array<Int>){
        for(i in 0 until arr.size-1){
            for (j in i+1 until arr.size-1){
                if (arr[j] < arr[i]){
                    val min = arr[j]
                    arr[j] = arr[i]
                    arr[i] = min
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
    var selection = SelectionSort()
    var arr = arrayOf(2,12,6,5,10,15,30,50)
    selection.sort(arr)
    selection.sortedArray(arr)
}