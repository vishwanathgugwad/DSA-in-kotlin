package com.example.dsa

fun pali(str : String) : Boolean{

    var n = str.length
    if (str.isEmpty())
        return false
    if (n <= 1){
        return true
    }
    var first = str.substring(0 , 1)
    var last = str.substring(n -1 , n)

    return if (first != last){
        false
    }else{
        pali(str.substring(1,str.length-1))
    }
    }

fun main(){

    var str = "baba"
    print(pali(str))
}

