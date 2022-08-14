package com.example.dsa.sll

 class  SinglyLinkedList {
     var head : Node? = null
    var tail : Node? =null
    var size : Int = 0

   fun create(value : Int): Node? {

       head = Node()
       var node= Node();
       node.next = null
       node.value = value
       head = node
       tail = node
       size=1

       return head

   }

     fun AddNode(nodeValue : Int , location : Int){

         var node = Node()
         node.value = nodeValue
         if (head == null){
             create(nodeValue)
             return
         }else if (location == 0){
             node.next = head
             head = node
         }else if (location >= size){
             node.next = null
             tail?.next = node
             tail = node
         }
         else{
             var tempNode = head
             var index = 0
             while (index < location-1){
                 tempNode = tempNode?.next
                 index++
             }
             var nextNode = tempNode?.next
              tempNode?.next = node
             node.next = nextNode
         }
         size++

     }

     //sll traversal
     fun traverseSll(){
         var node = Node()

         if (head == null){
             println("Sll does not exit")
         }else{
             var tempNode = head
             for (i in 0 .. size-1){
                 print("${tempNode?.value}")
                 if (i != size -1){
                     print("->")
                 }
                 tempNode = tempNode?.next
             }
         }
         println("\n")
     }


     //search for a node
     fun searchNode(nodeValue : Int): Boolean {
         if (head != null) {
             var currentNode = head
             for (i in 0..size - 1) {
                 if (currentNode?.value == nodeValue) {
                     println("found node at location $i")
                     return true
                 }
                 currentNode = currentNode?.next
             }

         }
        println("not found")
         return false
     }

     //deletion of node from sll

     fun deleteNode(location : Int){
         if (head==null){
             println("empty")
             return
         }else if(location == 0){
             head = head!!.next
             size--
             if (size == 0){
                 tail = null
             }
         }else if (location >= size){
             var tempNode = head
             for (i in 0 .. size-1){
                 tempNode = tempNode?.next
             }
             if (tempNode == head){
                 head = null
                 tail = null
                 size--
                 return
             }
             tempNode?.next = null
             tail = tempNode
             size--
         }else{
             var tempNode = head
             for (i in 0 .. location-1){
                 tempNode = tempNode?.next
             }
             tempNode?.next = tempNode?.next?.next
             size--
             return
         }

     }

     //delete entire sll
     fun deleteSll(){
         head = null
         tail = null
         println("SLL deleted successfully")
     }
}