package com.example.dsa.searching

import kotlin.math.min


fun main(){
    val arr = arrayOf(1,6,2,4,8,3,9)
   BinarySearch.searchElement(arr,3)
}



class LinearSearch{
    companion object{
        fun searchElement(arr : Any,element : Any): String {
            for (item in 0 ..(arr as Array<*>).size){
                if (arr[item] == element){
                    return "Element found at position $item"
                }
            }
            return "Element not found"
        }
    }
}

//BS mostly used for sorted array
class BinarySearch{
    companion object{
        fun searchElement(arr : Any , element : Any) {
            var start  = 0
            var end  = ((arr) as Array<*>).size - 1
            var mid  = ((start + end)/2)
            while (element != arr[mid] && (start) < end){
                if ((element as Int) < mid ){
                    end = mid - 1
                }else{
                    start = mid + 1
                }
                mid = (start +end) / 2
            }
            if (element == arr[mid]){
                println("Element is found at pos $mid")
            }
        }
    }
}

