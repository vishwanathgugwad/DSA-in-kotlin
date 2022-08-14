package com.example.dsa.interviewQuestionsStacksandQueues.stackMin

//All the operations must be in O(1) time complexities
class StackMin {

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
            min = Node(nodeValue,min!!)
        }else if (min!!.value < nodeValue){
            min = Node(min!!.value , min!!)
        }else{
            min = Node(nodeValue , min!!)
        }
        top = Node(nodeValue,top!!)
    }

    fun pop() : Int {
        min = min!!.next
        var result = top!!.value
        top = top!!.next
        return result
    }

}