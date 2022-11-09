package com.example.dsa.leetcodeproblems.easy

fun main(){
    var n = 49
    var numSum = 0
    while (n>0){
        val d = n % 10
        n /= 10
        numSum += d * d
    }
    println(numSum)


    val obj = Sun<Noob>()
    obj.push(Noob())

}
class Noob{
    val iam1 : String ? = null
}

class Sun<T>{
    private var first : Node ? = null
    inner class Node{
        var item : T? = null
        val next : Node? = null
    }
    fun push(item : T){
        val node = Node()
        node.item = item
    }
    fun pop() : T{
        val t = first?.item
        first = first?.next
        return t!!
    }

}