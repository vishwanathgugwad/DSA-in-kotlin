package com.example.dsa


//ex : num = 6  -> 1 + 2 + 3 = 6
fun main(){
    val n = readLine()
    val num = n?.toInt()
    var sum = 0

    for (i in 1 until num!!){
        if ( num%i == 0)
            sum += i
    }
    if (sum == num){
        println("YES")
    }
    else
        println("NO")

}

