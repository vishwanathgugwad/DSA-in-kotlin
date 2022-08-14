package com.example.dsa.cdll

class Cdll {
    var head : Node? = null
    var tail : Node? = null
    var size : Int = 0


    fun createCdll(value : Int): Node? {
        var node = Node()
        node.value = value
        head = node
        tail = node
        node.prev = node
        node.next = node
        size = 1
        return head
    }

    fun insert(value : Int , location : Int){
        var node = Node()
        node.value = value
        if (head == null){
            createCdll(value)
            return
        }else if (location == 0){
            node.next = head
            node.prev = tail
            head?.prev = node
            tail?.next = node
            head = node
        }else if (location>=size){
            node.next = head
            node.prev = tail
            head?.prev = node
            tail?.next = node
            tail = node
        }else{
            var tempNode = head
            for (i in 0 .. location){
                tempNode = tempNode?.next
            }

            node.prev = tempNode
            node.next = tempNode?.next
            tempNode?.next = node
            node.next?.prev = node
        }
        size++
    }


    fun traverse(){
        if (head == null){
            println("does not exist")
            return
        }else{
        var tempNode = head
        for (i in 0 .. size-1){
            print("${tempNode?.value}")
            if (i!= size-1){
            print("->")
            }
            tempNode = tempNode?.next
        }
        }
    }

    fun revTraverse(){
        if (head == null){
            println("does not exist")
            return
        }else{
            var tempNode = tail
            for (i in size-1 downTo 0){
                print("${tempNode?.value}")
                if (i!= 0){
                    print("<-")
                }
                tempNode = tempNode?.prev
            }
            println("\n")
        }
    }
    fun search(value : Int){
        if (head == null){
            println("Does not exist")
            return
        }else
        {
            var tempNode = head
            for (i in 0 .. size-1){
                if (tempNode?.value == value){
                    println("$value is found at pos $i")
                }
                tempNode= tempNode?.next
            }
        }
        println("value not found")
    }

    fun del(location: Int){
        if (head == null){
            println("doesnot exist")
            return
        }else if (location == 0){
            if (size == 1){
                head?.prev = null
                head?.next = null
                head = null
                tail = null
                size --
                return
            }else{
                head = head?.next
                head?.prev = tail
                tail?.next = head
                size --
                return
            }
        }else if (location >=size){
            if (size == 1){
                tail?.next = null
                tail?.prev = null
                head = null
                tail = null
                size --
                return
            }else{
                tail = tail?.prev
                tail?.next = head
               head?.prev = tail
                size --
                return

            }
        }else{
            var tempNode = head
            for (i in 0 until location-1){
                tempNode = tempNode?.next
            }
            tempNode?.next = tempNode?.next?.next
            tempNode?.next?.prev = tempNode
            size --
            return
        }
    }

    fun delEntireCdll(){
        var tempNode = head
        for (i in 0 until size){
            tempNode?.prev = null
            tempNode = tempNode?.next
        }
        tail?.next = null
        head = null
        tail = null
        println("Deleted completely")
    }
}