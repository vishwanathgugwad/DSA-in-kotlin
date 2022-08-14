package com.example.dsa.stack

fun main(){
// This below code is for stack using array
//    var stackArr = Stack(4)
//
//    stackArr.push(10)
//    stackArr.push(20)
//    stackArr.push(30)
//    stackArr.push(40)
//
//    println( stackArr.pop())
//    println( stackArr.pop())
//
////    stackArr.delstackArr()
//
//    stackArr.traverse()

// This below code is for stack using linkedlists
     var stackLL = StackLL()
    stackLL.push(10)
    stackLL.push(20)
    stackLL.push(30)

    println(stackLL.peek())
    println(stackLL.pop())
    println(stackLL.pop())
    println(stackLL.peek())


    stackLL.delStack()






}