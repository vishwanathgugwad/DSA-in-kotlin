package com.example.dsa.LLinterviewquestions


fun main(){

    var ll = LinkedList()

    ll.createLL(10)
    println(ll.head?.value)
    ll.insert(7)
    ll.insert(1)
    ll.insert(6)

    ll.traverse()




    //questions
    var q = Questions()
    q.removeDups(ll)
    ll.traverse()
    var n =  q.nThLast(ll,2)
    println(n?.value)

    q.partition(ll, 40)
    ll.traverse()

}