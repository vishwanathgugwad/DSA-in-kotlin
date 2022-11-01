package com.example.dsa

//sum of digits of a positive number
//ex: 55 = 5+5 = 10
fun sumD(num : Int): Int {
    if (num == 0 || num<0){
        return  0
    }else {
        return num % 10 + sumD(num/10)
    }
    }
fun main(){

    var num = 55
    println(sumD(num))

}