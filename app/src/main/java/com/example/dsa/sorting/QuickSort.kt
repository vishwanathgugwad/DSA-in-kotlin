package com.example.dsa.sorting

import com.example.dsa.sorting.QuickSort.Companion.printArray

class QuickSort {

    companion object {
        private fun partition(arr: Array<Int>, start: Int, end: Int): Int {
            val pivot = arr[end]
            var i = start - 1
            for (j in start until end) {
                if (arr[j] <= pivot) {
                    i++
                    //swap
                    val temp = arr[i]
                    arr[i] = arr[j]
                    arr[j] = temp
                }
            }
            //swap with pivot
            i++
            val temp = arr[i]
            arr[i] = pivot
            arr[end] = temp
            return i
        }

        fun quickSort(arr: Array<Int>, start: Int, end: Int) {
            if (start < end) {
                val pivot = partition(arr, start, end)
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
    val arr = arrayOf(10,3,2,7,5,8,4,1,9,11)
    QuickSort.quickSort(arr,0,arr.size-1)
    printArray(arr)

}