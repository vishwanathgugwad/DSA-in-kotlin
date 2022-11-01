package com.example.dsa

fun fibonacci(num : Int) : Int{
    if (num==0 || num==1){
        return num
    }else{
 return fibonacci(num-1) + fibonacci(num -2)
    }
}


fun sumOfDigits(n :Int){

}


fun main(){
    val num = 1
    println(fibonacci(num))
}