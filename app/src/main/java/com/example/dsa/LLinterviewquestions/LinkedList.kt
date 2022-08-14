package com.example.dsa.LLinterviewquestions

class LinkedList {
    var head : Node? = null
    var tail : Node? = null
    var size : Int = 0


    fun createLL(value : Int){
        var node = Node()
        node.value = value
        node.next = null
        head = node
        tail = node
        size = 1
    }

    fun insert(value : Int){
        if (head == null){
            createLL(value)
            return
        }

        var node = Node()
        node.value = value

        node.next = null
        tail?.next = node
        tail = node
        size ++
    }
    fun traverse(){
        if (head == null){
            println("Doesa not exist")
        }else{
        var tempNode = head
            for (i in 0 .. size-1){
                print("${tempNode?.value}")
                if (i!=size-1){
                    print("->")
                }
                tempNode = tempNode?.next
            }

        }
        println("\n")
    }

}