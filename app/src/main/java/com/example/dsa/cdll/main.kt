package com.example.dsa.cdll


fun main(){
    val cdll = Cdll()
    //cdll.createCdll(10)
    println(cdll.head?.value)
    cdll.insert(20,0)
    cdll.insert(30,1)
    cdll.insert(40,2)
    cdll.insert(50,3)
    println(cdll.head?.next?.value)
    cdll.traverse()
    println("\n")
    cdll.revTraverse()
    cdll.search(40)
    cdll.del(1)

    cdll.delEntireCdll()
    cdll.traverse()
}