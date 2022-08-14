package com.example.dsa.circularsll

fun main(){


    val cSll = CircularSll()
    cSll.createCircularSll(10)
    cSll.addNode(20,0)
    cSll.addNode(30,1)
    cSll.addNode(40,2)
    println(cSll.head?.value)
    cSll.traversecSll()
    println("\n")
    cSll.delete(3)
    cSll.traversecSll()
}