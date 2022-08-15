package com.example.dsa.interviewQuestionsStacksandQueues.stackOfPlates

import java.util.*

class Stack {
    var size : Int = 0
    val capacity : Int
    var top :  StackNode? = null
    var bottom : StackNode? = null

    constructor(stackCapacity : Int){
        capacity = stackCapacity
    }
    fun isFull() : Boolean{
        return capacity == size
    }
    fun join(below: StackNode?,above: StackNode?){
        if (below!= null) below.above = above
        if (above!=null) above.below = below
    }

    fun push(nodeValue : Int) : Boolean{
        if (size>=capacity) return false
        size++
        val newNode = StackNode(nodeValue)
        if (size == 1) bottom = newNode
        join(newNode,top)
        top = newNode
        return true
    }

    fun pop() : Int{
        if (top == null) throw EmptyStackException()
        val result = top!!.value
        top = top!!.below
        size--
        return result
    }
   fun removeBottom() : Int?{
       val result = bottom
       bottom = bottom?.above
       if (bottom!= null) bottom!!.below = null
       size --
       return result?.value
   }
}

fun main(){
    val stack = Stack(3)
    println("is FUll "+ stack.isFull())
    println(stack.pop())
}