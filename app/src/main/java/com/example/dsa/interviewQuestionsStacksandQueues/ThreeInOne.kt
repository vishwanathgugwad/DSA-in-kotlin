package com.example.dsa.interviewQuestionsStacksandQueues

class ThreeInOne {

    var sizes : IntArray
    var values : IntArray
    var stackCapacity : Int? = null
    var numberOfStacks  : Int = 3

    constructor(size : Int){
        stackCapacity = size
        values = IntArray(stackCapacity!! * numberOfStacks)
        sizes = IntArray(size)
    }

    fun indexOfTop(stackNum : Int) : Int{
        var offSet = stackNum * stackCapacity!!
        var size = sizes[stackNum]
        return offSet + size-1;
    }
    fun isEmpty(stackNum: Int) : Boolean{
        return sizes[stackNum] == 0
    }
    fun isFull(stackNum: Int) : Boolean{
        return sizes[stackNum] == stackCapacity!!
    }
    fun push(stackNum: Int,value : Int){
        if (isFull(stackNum)){
            println("stack is full")
        }else{
            sizes[stackNum] ++
            var index = indexOfTop(stackNum)
            values[index] = value
        }
    }
    fun pop(stackNum: Int) : Int{
        var value  = -1
        if (isEmpty(stackNum)){
            println("stack is empty")
            return value
        }else{
            var index = indexOfTop(stackNum)
            value = values[index]
            values[index] = 0
            sizes[stackNum] --
            return value
        }
    }
    fun peek(stackNum: Int) : Int{
        if (isEmpty(stackNum)){
            println("stack is empty")
            return -1
        }else{
            var index = indexOfTop(stackNum)
            return values[index]
        }
    }


}