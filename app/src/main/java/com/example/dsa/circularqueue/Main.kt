package com.example.dsa.circularqueue


fun main() {

    var circularQueue = CircularQueue(3)

//
    circularQueue.enQueue(10)
    circularQueue.enQueue(20)
    circularQueue.enQueue(30)
   var deque =  circularQueue.deQueue()
    println(deque)
    var deque1 =  circularQueue.deQueue()
    println(deque1)
    var result1 = circularQueue.isFull()
    var peek = circularQueue.peek()
    println(result1)
    println(peek)

}