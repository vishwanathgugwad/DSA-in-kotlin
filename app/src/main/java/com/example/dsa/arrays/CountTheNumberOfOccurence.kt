package com.example.dsa.arrays



fun main(){

    var add = {a : Int , b : Int -> println("$a $b")}
    println(add(2,8))
    var printOut : (String) -> Unit  = {str  -> println(str)}
    printOut("vishwa")


    var hash = HashMap<Char,Int>()
    var arr = arrayOf(1,2,3,3,4,4,7,7,8,8,1)
    var str = "vishwanath gugwad"

    for (i in str){
        if (hash.containsKey(i)){
            hash[i] = (hash[i]?:0) + 1

        }else{
            hash[i] = 1
        }
    }
    for (j in hash){
        println("${j.key} Repeats ${j.value} times ")
    }
}