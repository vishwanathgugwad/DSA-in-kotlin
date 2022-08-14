package com.example.dsa.interviewQuestionsStacksandQueues.stackMin

//All the operations must be in O(1) time complexities
//Using linked list
class StackMinUsingLinkedList {

    var top : Node?
    var min : Node?


    constructor(){
        top = null
        min = null
    }

    fun min() : Int{
        return min!!.value
    }

    fun push(nodeValue : Int){
        if (min == null){
            min = Node(nodeValue,min)
        }else if (min!!.value < nodeValue){
            min = Node(min!!.value , min)
        }else{
            min = Node(nodeValue , min)
        }
        top = Node(nodeValue,top)
    }

    fun pop() : Int {
        min = min!!.next
        var result = top!!.value
        top = top!!.next
        return result
    }

}

class Node {

    var value : Int
    var next : Node?

    constructor(value: Int, next: Node?){
        this.value = value
        this.next = next
    }
}


fun main(){
    val stackMin = StackMinUsingLinkedList()

    stackMin.push(4)
    stackMin.push(10)
    stackMin.push(3)
    stackMin.push(12)
    stackMin.push(9)
    println(stackMin.min())
    println(stackMin.top?.value)
    println(stackMin.pop())

}