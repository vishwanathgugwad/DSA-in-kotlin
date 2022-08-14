package com.example.dsa

//multiples of 2 till n
//ex: n=10 fun-> returns 1,2,4,8

fun powerOfTwo(n : Int): Int {

    if (n == 0 || n==1) return n
    else{
        val prev = powerOfTwo(n/2)
        val curr = prev * 2
        println(curr)
        return curr
    }


}
fun main(){
    powerOfTwo(50)

}