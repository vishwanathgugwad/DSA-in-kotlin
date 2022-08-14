package com.example.dsa.circularqueue

class CircularQueue {

    var arr: IntArray? = null
    var begining: Int
    var top: Int
    var size: Int

    constructor(size: Int) {
        this.arr = IntArray(size)
        this.size = size
        this.begining = -1
        this.top = -1
        println("circular queue is created of size $size")
    }

    fun isEmpty(): Boolean {
        return top == -1
    }

    fun isFull() : Boolean{
         if(top+1 == begining){
           return true
        }else if (begining == 0 && top+1 == size){
            return true
         }else{
             return false
         }
    }
    fun enQueue(value : Int) {
        if (isFull()) {
            println("Queue is full")
            return
        } else if (isEmpty()) {
            begining = 0
            top++
            arr!![top] = value
            println("Added element at the beginning ")
        } else {
            if (top + 1 == size) {
                top = 0
            } else {
                top++
            }
            arr!![top] = value
            println("value has been added")
        }
    }

    fun  deQueue() : Int? {
        if (isEmpty()){
            println("queue is empty")
            return -1
        }else{
            var result = arr!![begining]
            arr!![begining] = 0
            if (begining == top){
                begining = -1
                top = -1
            }else if (begining+1 == size){
                begining = 0
            }else{
                begining++
            }
            return result
        }
    }
    fun peek() : Int?{
        if (isEmpty()){
            println("queue is empty")
            return -1
        }else{
            return arr!![begining]
        }
    }


}