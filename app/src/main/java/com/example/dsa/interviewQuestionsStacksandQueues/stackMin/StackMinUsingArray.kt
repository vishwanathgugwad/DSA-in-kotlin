package com.example.dsa.interviewQuestionsStacksandQueues.stackMin


//finding stack min using array
class StackMinArr {

    var top : IntArray
    var min : IntArray
    var minIndex : Int
    var topIndex : Int
    var prevMin : Int = 0


    constructor(size : Int){
        top = IntArray(size)
        min = IntArray(size)
        minIndex = 0
        topIndex = 0
    }

    fun  min() : Int{
        return min[minIndex]
    }
    fun push(nodeValue : Int) {
        if (min[minIndex] == 0){
            min[minIndex] = nodeValue
            prevMin = min[minIndex]
        }else if (min[minIndex] < nodeValue){
            minIndex++
            min[minIndex] = prevMin
        }else{
            minIndex++
            min[minIndex] = nodeValue
            prevMin = min[minIndex]
        }
        top[topIndex] = nodeValue
        topIndex++
    }

    fun pop() : Int{
        var result = top[topIndex-1]
        minIndex --
        topIndex --
        return result
    }
}


fun main(){

    var stackMin = StackMinArr(5)

    stackMin.push(30)
    stackMin.push(50)
    stackMin.push(20)
    stackMin.push(10)
    stackMin.push(40)
    println(stackMin.pop())
    println(stackMin.pop())
    println(stackMin.pop())
    println(stackMin.min())
    println(stackMin.minIndex)
    println(stackMin.topIndex)
}