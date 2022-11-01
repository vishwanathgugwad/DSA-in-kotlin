package com.example.dsa

fun main(){

    for (i in 0..13)
        if (i%6 == 0 ){
            println(i)
        }
    println(gg())
}

fun gg() : Int{
    var sum = 0
    for (i in 1..13){
        if (i%6==0){
             sum = i
        }else{

        }
    }
    return sum

}