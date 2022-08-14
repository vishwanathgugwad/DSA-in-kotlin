package com.example.dsa.LLinterviewquestions

class Questions {

fun removeDups(ll : LinkedList){
    var hs = HashSet<Int>()
    var current = ll.head
    var prev : Node? = null

    while (current != null){
        var currVal = current.value
        if (hs.contains(currVal)){
            prev?.next = current.next
            ll.size --
        }else{
            hs.add(currVal!!)
            prev = current
        }
        current = current.next
    }

}

    fun nThLast(ll : LinkedList , n : Int): Node? {

        var p1 = ll.head
        var p2 = ll.head

       for (i in 0 until  n){
            if (p2 == null) return null
            p2 = p2.next
        }
        while (p2!=null){
            p1 = p1?.next
            p2 = p2.next
        }
        return p1
    }

    fun partition(ll : LinkedList, n : Int): LinkedList {
        var currentNode = ll.head
        ll.tail = ll.head
        while (currentNode != null){
            var next = currentNode?.next
            if (currentNode?.value!! < n){
                currentNode?.next = ll.head
                ll.head = currentNode
            }else{
                ll.tail?.next = currentNode
                ll.tail = currentNode
            }
            currentNode = next
        }
        ll.tail?.next = null
        return ll
    }

    fun sumList(ll1 : LinkedList , ll2 : LinkedList): LinkedList {

        var node1 = ll1.head
        var node2 = ll2.head
        var carry = 0
        var resultLL = LinkedList()

        while (node1 != null || node2 != null){
            var result = carry

            if (node1!=null){
                result += node1.value!!
                node1 = node1.next
            }
            if (node2!=null){
                result += node2.value!!
                node2 = node2.next
            }
            resultLL.insert(result%10)
            carry = result/10
        }
        return resultLL

        
    }
    fun intersection(ll1 : LinkedList , ll2 : LinkedList): Node {
        var node1 = ll1.head?.next
        var node2 = ll2.head
        var resultNode = Node()

        while (node1!= null && node2 !=null){
            if (node1.next == node2.next){
                resultNode = node1.next!!
            }
            node1 = node1.next
            node2 = node2.next
        }
        return resultNode

    }

}

fun main(){
    var ll1 = LinkedList()
    ll1.insert(7)
    ll1.insert(1)
    ll1.insert(6)
    var ll2 = LinkedList()
    ll2.insert(5)
    ll2.insert(9)
    ll2.insert(2)
    var q = Questions()
    var result = q.sumList(ll1,ll2)
    result.traverse()
}