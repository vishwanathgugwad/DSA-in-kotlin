package com.example.dsa.circularqueue.usingLL


fun main(){
    var qLL = QueueLinkedList()
    qLL.enQueue(10)
    qLL.enQueue(20)
    qLL.enQueue(30)
    println(qLL.isEmpty())
    println(qLL.deQueue())

    println(qLL.peek())
    qLL.delete()
    println(qLL.peek())



}