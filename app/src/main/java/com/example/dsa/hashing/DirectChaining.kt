package com.example.dsa.hashing

import java.util.*
import kotlin.collections.ArrayList

//Direct chaining is used to prevent collusion in hashing
class DirectChaining {
    var hashTable :Array<LinkedList<String>?>
    val maxChainSize = 5
    constructor(size : Int){
        hashTable = Array(size){ LinkedList() }
    }

    fun modAsciiHashFun(value : String , listSize : Int) : Int{
        val ch = value.toCharArray()
        var sum  = 0
        for (i in ch.indices){ // --------------------------------------------- O(N) time complexity
            sum += ch[i].code
        }
        return sum % listSize
    }

    fun insertHashTable(value :String){
        if (hashTable == null){
            print("hash table does not exist ")
            return
        }
        val index  = modAsciiHashFun(value,hashTable.size)//------------------- O(N) time complexity
        if (hashTable[index] != null){
            hashTable[index]?.add(value)
        }else{
            hashTable[index] = LinkedList<String>()
            hashTable[index]?.add(value)
        }
    }
    fun displayValues(){
        for (i in hashTable.indices){
            println("value at index $i is ${hashTable[i]} ")
        }
    }
    fun searchValue(str : String): Boolean{
        val index = modAsciiHashFun(str,hashTable.size)
        if (hashTable[index]!= null && hashTable[index]?.contains(str) == true){
            println("Value found at index $index")
            return true
        }else{
            println("Not found")
            return false
        }
    }
    fun delete(str : String){
        val index = modAsciiHashFun(str,hashTable.size)
        if (searchValue(str)){
            hashTable[index]?.remove(str)
            println("Value deleted at $index")
        }else{
            println("Not found")
        }
    }

    fun isFull(index : Int) :Boolean{
        return hashTable[index]?.size == maxChainSize
    }

    }
    fun main(){
val hashTable = DirectChaining(10)
        hashTable.insertHashTable("the")
        hashTable.insertHashTable("the")
        hashTable.insertHashTable("the")
        hashTable.insertHashTable("quick")
        hashTable.insertHashTable("quick")
        hashTable.insertHashTable("brown")
        hashTable.insertHashTable("fox")
        hashTable.insertHashTable("and")

        hashTable.displayValues()
        println(hashTable.isFull(1))
//        hashTable.searchValue("the")
//        hashTable.delete("brown")
//        hashTable.displayValues()

}
