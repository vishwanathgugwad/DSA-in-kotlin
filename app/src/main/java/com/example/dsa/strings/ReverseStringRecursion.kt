package com.example.dsa

fun strReverse(str : String): String {
    if (str == null || str.length<=1){
        return str
    }else{
        return strReverse(str.substring(1)) + str[0]
    }

}

fun main(){
    val str = "kotlin"
    println(strReverse(str))
}