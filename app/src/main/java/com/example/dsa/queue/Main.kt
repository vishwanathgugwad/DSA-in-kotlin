package com.example.dsa.queue

fun main(){

    var queueArray = QueueArray(5)

    queueArray.enqueue(10)
    queueArray.enqueue(20)
    queueArray.enqueue(30)
    queueArray.enqueue(40)

    println(queueArray.deQueue())
    println(queueArray.deQueue())



}