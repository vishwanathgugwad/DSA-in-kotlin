package com.example.dsa



fun fact(n: Int) : Int{
    if(n==0 || n<0) {
        return 1
    }else {
            return n * fact(n - 1)
        }
}
fun main(){

    val n = 3;
    print(fact(n))
}