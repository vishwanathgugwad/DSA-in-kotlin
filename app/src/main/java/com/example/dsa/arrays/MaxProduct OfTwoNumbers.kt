package com.example.dsa.arrays




fun main(){

    val arr = arrayOf(10,40,30,20,50)
    print(maxProd(arr))

}

fun maxProd(arr : Array<Int>): String {
    var maxProd  = 0
    var pair = ""

        for (i in arr.indices){
            for (j in i+1 until arr.size){
                if (arr[i] * arr[j] > maxProd){
                maxProd = arr[i] * arr[j]
                 pair = arr[i].toString() + " , "+ arr[j].toString()

            }
        }
    }
    return pair
}
