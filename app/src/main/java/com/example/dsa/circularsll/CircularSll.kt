package com.example.dsa.circularsll

import com.example.dsa.first

class CircularSll {

    var head : Node? = null
    var tail : Node? = null
    var size = 0

    fun createCircularSll(nodeValue : Int): Node? {
        var node = Node()
         head = Node()
        node.value = nodeValue
        node.next = node
        head = node
        tail = node
        size++
        return head
    }
    fun addNode(nodeValue: Int, location: Int){

        var node = Node()
        node.value = nodeValue
        if (head == null){
            createCircularSll(nodeValue)
            return
        }else if (location == 0){
            node.next = head
            head = node
            tail?.next=head
        }else if (location >= size){
            tail?.next = node
            tail = node
            tail?.next = head
        }else{
            var tempNode = head
            var index = 0
            while (index < location-1){
                tempNode = tempNode?.next
                index++
            }

            node.next = tempNode?.next
            tempNode?.next = node
        }
    size++
    }
    fun traversecSll(){
        var tempNode = head
        if (head == null){
            println("cssl doesnot exist")
        }else
        for (i in 0 .. size-1){
            print(tempNode?.value)
            if (i!= size-1){
                print("->")
            }
            tempNode = tempNode?.next
        }
    }
    fun search(value : Int){
        var tempNode = head
        if (head == null){
            println("cssl doesnot exist")
        }else
            for (i in 0 .. size-1){
                if(value == tempNode?.value){
                    println("found at pos $i")
                    return
                }
                tempNode = tempNode?.next
            }
        println("not found")
        return
    }
    fun delete(location: Int){

        if (head == null){
            println("Cll doesnot exist")
            return
        }else if (location == 0){
            head = head?.next
            tail?.next = head
            size--
            if (size == 0){
                tail = null
                head?.next = null
                head = null
            }
        }else if (location>=size){
            var tempNode = head
            for (i in 0 .. size-1){
                tempNode = tempNode?.next
            }
            if (tempNode == head){
                tail = null
                head = null
                size--
                return
            }
            tempNode?.next = head
            tail = tempNode
            size--
        }else{
            var tempNode = head
            for (i in 0..size-1){
                tempNode = tempNode?.next
            }
            tempNode?.next = tempNode?.next?.next
            size--
        }

    }
    fun delete(){
        head= null
        tail?.next = null
        tail = null
    }

}