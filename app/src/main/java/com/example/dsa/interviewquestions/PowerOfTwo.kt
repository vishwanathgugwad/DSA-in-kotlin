package com.example.dsa

fun isPowerOfTwo(n : Int): Boolean {

    if (n==1 || n==2) return true
    if (n%2==1 || n==0) return false

    return isPowerOfTwo(n/2)


}
fun main(){
    println(isPowerOfTwo(9))
}