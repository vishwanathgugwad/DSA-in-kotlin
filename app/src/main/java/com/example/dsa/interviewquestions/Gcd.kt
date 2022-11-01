package com.example.dsa

import kotlin.math.max
//eculids algo
fun gcd(a:Int,b:Int): Int {

    if (a<0 || b<0){
        return -1
    }
    if (b==0){
        return a
    }else{
        return gcd(b,a%b)
    }
}
fun main(){
    println(gcd(100,2000))

}