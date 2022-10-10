package com.example.dsa.sorting

import com.example.dsa.sorting.QuickSort.Companion.printArray

class QuickSort {

    companion object {
        fun partition(arr: Array<Int>, start: Int, end: Int): Int {
            val pivot = end
            var i = start - 1
            for (j in start until end) {
                if (arr[j] <= arr[pivot]) {
                    i++
                    var temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                }
            }
            return i
        }

        fun quickSort(arr: Array<Int>, start: Int, end: Int) {
            if (start < end) {
                var pivot = partition(arr, start, end)
                quickSort(arr, start, pivot - 1)
                quickSort(arr, pivot + 1, end)
            }
        }
        fun printArray(arr : Array<Int>) {
            for (i in arr) {
                print("$i ")
            }
        }
    }

//    fun printArray(arr :Array<Int>) {
//        for (i in arr) {
//            print("$i ")
//        }
//    }
}

fun main(){
    val arr = arrayOf(10,3,2,7,7,5,8,4,1,2,9,7,8,11)
    QuickSort.quickSort(arr,0,arr.size-1)
    printArray(arr)

}