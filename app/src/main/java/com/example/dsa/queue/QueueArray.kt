package com.example.dsa.queue

class QueueArray {
    var arr: IntArray? = null
    var begining: Int
    var top: Int

    constructor(size: Int) {
        this.arr = IntArray(size)
        this.begining = -1
        this.top = -1
        println("The queue is created with size $size")
    }

    fun  isFull() : Boolean{
        return top == arr?.size!!-1
    }

    fun isEmpty() : Boolean {
    return (begining == -1 && top == -1)
    }

    fun enqueue(value: Int) {
        if (isFull()) {
            println("Queue is full")
            return
        }
        else if (isEmpty()) {
                begining = 0
                top++
                arr?.set(top, value)
                println("value is added at the beginning of queue")
            } else {
                top++
                arr?.set(top, value)
                println("value is added ")
            }
    }
    fun deQueue() : Int{
        if (isEmpty()){
            println("Queue is empty")
            return -1
        }else{
            var result = arr!![begining]
            begining++
            if (begining > top){
                begining = -1
                top = -1
                return -1
            }
            return result
            println("Dequeued")
        }

    }

    fun peek() : Int{
        if (isEmpty()){
            println("Queue is empty")
            return -1
        }else{
            return arr!![begining]
        }
    }

    fun delQueue(){
        if (isEmpty()){
            println("Queue is empty")
            return
        }else{
            arr = null
        }
    }


}