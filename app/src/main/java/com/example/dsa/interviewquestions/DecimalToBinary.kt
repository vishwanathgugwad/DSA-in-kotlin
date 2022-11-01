package com.example.dsa


fun decimal(num :Int) :Int{
    if (num == 0){
        return 0
    }else{
        return num%2 + 10 * decimal(num/2)
    }
}

fun main(){
    println(decimal(25))
}