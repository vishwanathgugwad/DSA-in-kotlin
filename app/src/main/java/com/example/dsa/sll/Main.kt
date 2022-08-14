package com.example.dsa.sll

fun main(){
 var sll = SinglyLinkedList()
    sll.create(10)
    //println(sll.head?.value)

    sll.AddNode(9,1)
    sll.AddNode(8,3)
    sll.AddNode(7,4)
    sll.AddNode(6,0)

    //println(sll.head?.next?.next?.value)

    sll.traverseSll()
    sll.searchNode(10)
    sll.deleteNode(0)
    sll.traverseSll()

   sll.deleteSll()
   sll.traverseSll()



}