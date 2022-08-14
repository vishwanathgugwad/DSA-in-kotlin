package com.example.dsa

fun main() {
    val arr = arrayOf("abc","def","ghi")
    repeat(3){
        Thread {
            println("${Thread.currentThread()} has started")
            for(i in arr){
                println("${Thread.currentThread()} - $i")
                Thread.sleep(50)
            }
        }.start()
    }

}