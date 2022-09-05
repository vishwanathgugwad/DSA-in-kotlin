package com.example.dsa.hashing

import kotlin.collections.ArrayList

class QuadraticProbing {


    var hashTable  : Array<String?>
    var cellsUsed : Int

    constructor(size : Int){
        hashTable = Array(size) { i -> null }
        cellsUsed = 0
    }

    fun modAsciiFun(str : String , m :Int) : Int{
        var sum :Int = 0
        if (str != null) {
            for (i in str.indices) {
                sum += str[i].code
            }
        }
        return sum % m
    }

    fun getLoadFactor() : Double {
        return cellsUsed * 1.0 / hashTable.size
    }

    fun reHAshKeys(word : String?){
        cellsUsed = 0
        var data  = ArrayList<String>(hashTable.size)
        for (i in hashTable){
            if (i!=null){
                data.add(i)
            }
        }
        data.add(word!!)
        hashTable = Array(hashTable.size * 2){i -> null}
        for (s in data){
            inseartInHAshTable(s)
        }
    }


    fun inseartInHAshTable(word: String?){
        if (getLoadFactor() >= 0.75){
            reHAshKeys(word)
        }else{
            var index = modAsciiFun(word!! , hashTable.size)
            var counter = 0
            for(index in index until  index+hashTable.size){
                var newIndex = (index + (counter * counter)) % hashTable.size
                if (hashTable[newIndex] == null){
                    hashTable[newIndex] = word
                    println("$word Inserted Successfully at $newIndex")
                    break
                }else{
                    println("$newIndex is already occupied trying next empty   cell ")
                }
                counter++
            }

            cellsUsed ++
        }
    }

    fun searchValue(word : String){
        val index = modAsciiFun(word,hashTable.size)
        for (index in index .. hashTable.size){
            var newIndex = index % hashTable.size
            if (hashTable[newIndex] != null && hashTable[index].equals(word)){
                println("value found at index $index")
                return
            }
        }
        println("value not found")
    }
    fun deleteValue(word : String){
        val index = modAsciiFun(word,hashTable.size)
        for (index in index .. hashTable.size){
            var newIndex = index % hashTable.size
            if (hashTable[newIndex] != null && hashTable[index].equals(word)){
                hashTable[newIndex] = null
                println("value deleted at index $index")
                return
            }
        }
        println("value not found")
    }
    fun displayValues(){
        for (i in hashTable.indices){
            println("value at index $i is ${hashTable[i]} ")
        }
    }
}

fun main(){
    val quadraticProbing = QuadraticProbing(5)
    quadraticProbing.inseartInHAshTable("The")
    quadraticProbing.inseartInHAshTable("quick")
    quadraticProbing.inseartInHAshTable("brown")
    quadraticProbing.inseartInHAshTable("fox")
    quadraticProbing.inseartInHAshTable("over")
    quadraticProbing.inseartInHAshTable("lazy")
    quadraticProbing.displayValues()

}