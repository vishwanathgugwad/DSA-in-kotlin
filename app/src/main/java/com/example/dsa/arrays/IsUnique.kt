package com.example.dsa.arrays



fun main(){
    val arr = arrayOf(1,2,3,4,5,5)

    var arr2 = arrayOf(5,1,1,4,3,4,7,5,7)
    removeDup(arr2)
    val result = isUnique(arr)
    println(result)
    println(hasDuplicates(arr))
}

fun isUnique(arr : Array<Int>): Boolean {
    var previous: Any? = null

    for (i in arr.indices) {
        for (j in i+1 until arr.size){
            if (arr[i] == arr[j]){
                return false
            }
        }
    }
    return true
}
//using sorting and single for loop
fun hasDuplicates(arr: Array<Int>): Int {
    var previous : Int? = null
    for (i in arr){
        if (i!= null && i == previous){
            return i
        }
        previous = i
    }
    return 0
}

// remove duplicates from unsorted array
fun removeDup(arr : Array<Int>){
    var map = mutableMapOf<Int,Int>()

    for (i in arr){
        if (map.containsKey(i)){
            println(i)
        }
        map[i] = i

    }

}