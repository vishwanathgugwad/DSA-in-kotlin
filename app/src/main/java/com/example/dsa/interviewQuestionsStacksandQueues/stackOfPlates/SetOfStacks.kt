package com.example.dsa.interviewQuestionsStacksandQueues.stackOfPlates

import java.util.*
import kotlin.collections.ArrayList

class SetOfStacks {

    var setOfStacks : ArrayList<Stack> = arrayListOf()
    val capacity : Int

    constructor( maxCapacity : Int){
        capacity = maxCapacity
    }

    fun getLastStack() : Stack?{
        return if (setOfStacks.size != 0 && setOfStacks !=null){
            setOfStacks[setOfStacks.size -1]
        }else null
    }

    fun push(nodeValue : Int){
        val lastStack = getLastStack()
        if (lastStack != null && !lastStack.isFull()){
            lastStack.push(nodeValue)
        }else{
            val newStack = Stack(capacity)
            newStack.push(nodeValue)
            setOfStacks.add(newStack)
        }
    }

    fun pop(): Int {
        val lastStack = getLastStack()
        if (lastStack == null) throw EmptyStackException()
        val result = lastStack.pop()
        if (lastStack?.size == 0){
            setOfStacks.removeAt(setOfStacks.size - 1)
        }
        return result
    }
    //helper method
    fun lestShift(index :Int , removeTop : Boolean) : Int{
        val stack = setOfStacks[index]
        var removedItem : Int
        if (removeTop){ removedItem = stack.pop()}
        else {removedItem = stack.removeBottom()!!}
        if (stack.size == 0){ setOfStacks.removeAt(index)}
        else if (setOfStacks.size > index +1){
            var v = lestShift(index+1 , false)
            stack.push(v)
        }
        return removedItem

    }
    fun popAt(stackIndex : Int) : Int {
        return lestShift(stackIndex,true)

    }
}
fun main(){

    val setOfStacks = SetOfStacks(3)
    setOfStacks.push(10)
    setOfStacks.push(20)
    setOfStacks.push(30)
    setOfStacks.push(40)
    setOfStacks.push(50)
    println(setOfStacks.popAt(0))
    //below code is still pending to be complated
//    println(setOfStacks.popAt(0))

}