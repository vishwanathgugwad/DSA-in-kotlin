package com.example.dsa.trees.binarySearchTree

import java.util.*

class BinarySearchTree {

    var root :TreeNode?


    constructor(){
        root = null
    }

    fun insert(value : Int){
        val newNode = TreeNode()
        newNode.value = value
        if (root == null){
            root = newNode
            println("Inserted")
            return
        }
        var queue : Queue<TreeNode> = LinkedList()
        while (!queue.isEmpty()){
            var presentNode = queue.remove()

            if (presentNode.left == null && value< presentNode.value!!){
                presentNode.left = newNode
            }
            if (presentNode.right == null && value > presentNode.value!!){
                presentNode.right = newNode
            }
        }
    }
}