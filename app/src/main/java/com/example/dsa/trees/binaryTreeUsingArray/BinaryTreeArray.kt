package com.example.dsa.trees.binaryTreeUsingArray

import java.util.*

class BinaryTreeArray {

    var tree : IntArray
    var lastUsedIndex : Int

    constructor(size : Int){
        tree = IntArray(size+1)
        lastUsedIndex = 0
    }
    fun isFull() : Boolean{
        return tree.size == lastUsedIndex+1
    }
    fun isEmpty() : Boolean{
        return  lastUsedIndex == 0
    }

    fun insertValue(value : Int){
        if (!isFull()){
            tree[lastUsedIndex+1] =value
            lastUsedIndex ++
            println("Inserted node")
        }else{
            println("Tree is full")
        }
    }

    fun preOrderTraverse(index : Int){
        if (index > lastUsedIndex){
            return
        }
        print(" "+ tree[index])
        preOrderTraverse(index *2 )
        preOrderTraverse(index *2 + 1)
    }
    fun inorderTraverse(index : Int){
        if (index > lastUsedIndex){
            return
        }
        inorderTraverse(index *2 )
        print(" "+ tree[index])
        inorderTraverse(index *2 + 1)
    }
    fun postorderTraverse(index : Int){
        if (index > lastUsedIndex){
            return
        }
        postorderTraverse(index *2 )
        postorderTraverse(index *2 + 1)
        print(" "+ tree[index])
    }
    fun levelorderTraverse(index : Int){
        if (index > lastUsedIndex){
            return
        }
     tree.forEach {
         if (it>0)
         println(it)
     }
    }

    fun searchElement(value : Int){
        if (!isEmpty())
        for (i in 1 until tree.size){
            if (tree[i] == value){
                println("$value found at position $i")
                return
            }
        }
        println("value doesnot exist")
    }
    fun deleteElement(value : Int){
        val deepestNode = deepestNode()
        for (i in 1 until tree.size){
            if (tree[i] == value){
                tree[i] = deepestNode
                println("Deleted node")
                lastUsedIndex --
                return
            }
        }
    println("Node not found")


    }
    fun deleteTree(){
        try {
            tree = IntArray(0)
            println("tree deleted")
        }catch (e : Exception){
            println("error $e")
        }
    }

    fun deepestNode() : Int{
        if (isEmpty()){
            return -1
        }
        return tree[lastUsedIndex]
    }

}




fun main(){
    val binaryTree = BinaryTreeArray(5)
    binaryTree.insertValue(10)
    binaryTree.insertValue(20)
    binaryTree.insertValue(30)
    binaryTree.insertValue(40)
    binaryTree.insertValue(50)
    binaryTree.deleteElement(30)
    binaryTree.searchElement(0)
    binaryTree.deleteTree()
    binaryTree.searchElement(10)

}