package com.example.dsa.kotlinconcepts


fun main(){

    calculateTime("vish") { loop(100000)  }
}

inline fun calculateTime(name : String, fn : ()-> Unit) {

    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("${end - start} mills")

}
fun loop(n: Long) {
    for (i in 1..n){
        //
    }
}



