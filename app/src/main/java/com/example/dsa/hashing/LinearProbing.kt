package com.example.dsa.hashing

import kotlin.collections.ArrayList

class LinearProbing {


    var hashTable  : Array<String?>
    var cellsUsed : Int

    constructor(size : Int){
        hashTable = Array(size) { i -> null }
        cellsUsed = 0
    }

    fun modAsciiFun(str : String , m :Int) : Int{
        var sum :Int = 0
        for (i in str.indices){
            sum += str[i].code
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
        for (s in hashTable){
                inseartInHAshTable(s)

        }
    }


    fun inseartInHAshTable(word: String?){
         if (getLoadFactor() >= 0.75){
            reHAshKeys(word)
        }else{
            var index = modAsciiFun(word!! , hashTable.size)
            for(index in index until  index+hashTable.size){
                var newIndex = index % hashTable.size
                if (hashTable[newIndex] == null){
                    hashTable[newIndex] = word
                    println("${word} Inserted Successfully at $newIndex")
                    break
                }else{
                    println("$newIndex is already occupied trying next empty   cell ")

                }
            }

             cellsUsed ++
         }
    }
    fun displayValues(){
        for (i in hashTable.indices){
            println("value at index $i is ${hashTable[i]} ")
        }
    }
}

fun main(){
    val linearProbing = LinearProbing(5)
    linearProbing.inseartInHAshTable("The")
    linearProbing.inseartInHAshTable("quick")
    linearProbing.inseartInHAshTable("brown")
    linearProbing.inseartInHAshTable("fox")
    linearProbing.inseartInHAshTable("over")
   linearProbing.displayValues()

}