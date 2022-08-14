package com.example.dsa.circularqueue.usingLL

import com.example.dsa.sll.SinglyLinkedList

class QueueLinkedList {

    lateinit var list: SinglyLinkedList

    constructor() {
        list = SinglyLinkedList();
        println("The queue is successfully created")
    }

    fun isEmpty(): Boolean {
        return list.head == null
    }

    fun enQueue(value: Int) {
        list.AddNode(value, list.size)
        println("successfully inserted ")
    }

    fun deQueue(): Int {
        var value = -1
        if (isEmpty()) {
            println("Queue is empty")
            return -1
        } else {
            value = list.head?.value!!
            list.deleteNode(0)
        }
        return value

    }

    fun peek(): Int {
    if (isEmpty()){
        println("Queue is empty")
        return -1
    }else{
        return list.head?.value!!
    }
    }

    fun delete() {
        if (isEmpty()) {
            println("Queue is empty")
        }else{
            list.deleteSll()
        }
    }
}