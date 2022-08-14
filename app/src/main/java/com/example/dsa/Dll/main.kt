package com.example.dsa.Dll



fun main(){

    val dll = Doublell()
    dll.create(10)

    println(dll.head?.value)

    dll.insert(20,0)
    dll.insert(30,1)
    dll.insert(40,2)
    dll.insert(50,3)
    dll.traverse()
    println()
    dll.reverseTraverse()

    dll.search(20)
    dll.deleteDll(2)
    dll.traverse()
    dll.delCopmleteDll()
    dll.traverse()
}