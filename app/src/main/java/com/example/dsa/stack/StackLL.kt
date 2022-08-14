package com.example.dsa.stack

import com.example.dsa.sll.Node
import com.example.dsa.sll.SinglyLinkedList

class StackLL {
     var ll = SinglyLinkedList()



    fun push(nodeValue: Int) {
        ll.AddNode(nodeValue , 0)
        println("Inserted $nodeValue in stack")
    }
    fun peek(): Int? {
        return ll.head?.value
    }
    fun pop(): Int {
        var result = -1
        if (isEmpty()){
           println("The stack is empty")
        }else{
            result = ll.head?.value!!
            ll.deleteNode(0)
        }
        return result
    }

    fun isEmpty(): Boolean
    {
        return ll.head == null
    }
    fun delStack(){
        ll.deleteSll()
        println("Stack has been deleted")
    }
}