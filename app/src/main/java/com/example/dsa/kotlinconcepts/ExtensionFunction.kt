package com.example.dsa.kotlinconcepts



fun main(){

    println(x.greater())

}

val x = 10
val y =20


fun Int.greater() : Boolean {
    return this> y
}