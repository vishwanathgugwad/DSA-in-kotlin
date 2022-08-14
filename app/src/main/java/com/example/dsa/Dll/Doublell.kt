package com.example.dsa.Dll

class Doublell {
    var head : Node? =null
    var tail : Node? =null
    var size : Int =0


    fun create(nodeValue : Int): Node? {
        val node = Node()
        head = Node()

        node.value = nodeValue
        head = node
        node.next = null
        node.prev = null
        tail = node
        size = 1
        return head
    }
    fun insert(nodeValue: Int , location : Int) {
        val node = Node()
        node.value = nodeValue
        if (head == null){
            create(nodeValue)
            return
        }else if (location == 0){
            node.next = head
            node.prev = null
            head?.prev = node
            head = node
        }else if (location>= size){
            node.next = null
            node.prev = null
            tail?.next = node
            tail = node

        }else{
            var tempNode = head
            var index = 0
            while (index<location-1){
                tempNode = tempNode?.next
                index++
            }
            val nextNode = tempNode?.next
            node.next = nextNode
            node.prev = tempNode
            node.next?.prev = node
            tempNode?.next = node
        }
        size++

    }
    fun traverse(){

        if (head == null){
            println("Does not exist")
        }
        var tempNode =head

        for (i in 0 .. size-1){
            print("${tempNode?.value}")
            if (i!=size-1){
                print("->")
            }
            tempNode = tempNode?.next
        }
    }

    fun reverseTraverse(){
        if (head == null){
            println("Does not Exist")
        }
        var tempNode = tail
        var lastNode =  size-1
        for (i in lastNode downTo 0){
            print("${tempNode?.value}")
            if (i != size-1){
                print("<-")
            }
            tempNode = tempNode?.prev
        }
        println("\n")
    }

    fun search(value : Int) :Boolean {
        if (head == null){
            println("Doesnot exist")
            return false
        }
        var tempNode = head
        for (i in 0 .. size-1){
            if (tempNode?.value == value){
                println("$value found at pos $i")
                return true
            }
            tempNode = tempNode?.next
        }
    println("node not found")
        return false
    }
    fun deleteDll(location : Int){
        if (head == null){
            println("Does not exist")
            return
        }else if (location == 0){
            if (size == 1){
                head = null
                tail = null
                size --
                return
            }else{
            head = head?.next
            head?.prev = null
                size --
            }
        }else if (location>=size){
            var oneNode = tail?.prev
            if (size == 1){
                head = null
                tail = null
                size --
                return
            }else{
                oneNode?.next = null
                tail = oneNode
                size --
            }
        }else{
            var tempNode = head
            for (i in 0 .. location-1){
                tempNode = tempNode?.next
            }
            tempNode?.next = tempNode?.next?.next
            tempNode?.next?.prev = tempNode
            size --
            return
        }

    }

    fun delCopmleteDll(){
        var tempNode = head
      for (i in 0 until  size){
          tempNode?.prev = null
          tempNode = tempNode?.next
      }
        head = null
        tail = null
        println("The Dll has been deleted")
    }
}