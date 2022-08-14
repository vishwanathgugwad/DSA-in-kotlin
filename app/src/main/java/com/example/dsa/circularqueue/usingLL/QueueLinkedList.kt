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
class Node {

    var value : Int? = null
    var next : Node? = null

}


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