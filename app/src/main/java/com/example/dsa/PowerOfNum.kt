package com.example.dsa


fun powerOf(num : Int,exp : Int): Int {

    if (exp<0){
        return -1
    }
    return if (exp == 0 ){
        1
    }else{
        num * powerOf(num , exp-1)
    }
}

fun main(){
    println(powerOf(2,4))
}