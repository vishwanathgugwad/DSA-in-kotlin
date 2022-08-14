package com.example.dsa



fun prod(arr : Array<Int> , num : Int): Int {
    if (num <= 0){
        return 0
    }else{
        return prod(arr,num-1)+ arr[num-1]
    }

}

fun main(){
    val arr = arrayOf(1,2,3,4,5)
    var num = arr.size
    num = num-1

   // println(prod(arr,num))
    println(arr)
}