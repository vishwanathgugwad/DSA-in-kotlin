package com.example.dsa.stack

class Stack {
    var arr : IntArray? = null
    var topOfStack :Int


    constructor(size : Int){
        this.arr = IntArray(size)
        this.topOfStack = -1
        println("Stack is created with the size of $size")
    }
    //isEmpty
    fun isEmpty() : Boolean{
        return if (topOfStack == -1){
             true
        }else{
        return false
        }
    }

    fun isFull() : Boolean{
         if (topOfStack == arr?.size?.minus(1)){
            println("stack is full")
             return true

        }else{
            return false
        }
    }
    fun push(value : Int){
        if (isFull()){
            println("cannot push stack is full")
            return
        }else{
            arr?.set(topOfStack + 1 , value)
            topOfStack += 1
            println("value is successfully inserted")
        }
    }

    fun pop(): Int {
        return if (isEmpty()){
            println("stack is empty")
            -1
        }else{
            var topStack = arr!![topOfStack]
            topOfStack --
            topStack
        }
    }

    fun delStack(){
        arr = null
        println("Stack has been deleted")
    }
    fun traverse(){
    if (arr == null){
        println("Stack is empty")
    }else{
        for (i in arr!!){
            println(i)
        }
    }
    }

}