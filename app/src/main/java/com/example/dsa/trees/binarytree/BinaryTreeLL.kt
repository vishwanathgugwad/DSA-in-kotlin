package com.example.dsa.trees.binarytree

import java.util.*

class BinaryTreeLL {
    var root : BinaryNode?


    constructor(){
        root = null
    }

    fun perOrderTraverse(node : BinaryNode?){
        if (node == null) return
        print(node.value + " ")
        perOrderTraverse(node.left)
        perOrderTraverse(node.right)
    }
    fun inOrderTraverse(node : BinaryNode?){
        if (node == null) return
        inOrderTraverse(node.left)
        print(node.value + " ")
        inOrderTraverse(node.right)
    }
    fun postOrderTraverse(node : BinaryNode?){
        if (node == null) return
        postOrderTraverse(node.left)
        postOrderTraverse(node.right)
        print(node.value + " ")
    }
    fun levelOrderTraverse(){

        var queue : Queue<BinaryNode> = LinkedList()
        queue.add(root)
        while (!queue.isEmpty()){
            var presentNode : BinaryNode = queue.remove()
            print(presentNode.value + " ")
            if (presentNode.left!=null){
                queue.add(presentNode.left)
            }
            if (presentNode.right!=null){
                queue.add(presentNode.right)
            }
            }
    }



}

fun main(){


    val binaryTreeLL = BinaryTreeLL()
    val n1 = BinaryNode()
    n1.value = "N1"
    val n2 = BinaryNode()
    n2.value = "N2"
    val n3 = BinaryNode()
    n3.value = "N3"
    val n4 = BinaryNode()
    n4.value = "N4"
    val n5 = BinaryNode()
    n5.value = "N5"
    val n6 = BinaryNode()
    n6.value = "N6"
    val n7 = BinaryNode()
    n7.value = "N7"
    val n8 = BinaryNode()
    n8.value = "N8"
    val n9 = BinaryNode()
    n9.value = "N9"

    n1.left = n2
    n1.right = n3
    n2.left = n4
    n2.right = n5
    n3.left = n6
    n3.right = n7
    n4.left = n8
    n4.right = n9

    binaryTreeLL.root = n1
    //binaryTreeLL.perOrderTraverse(binaryTreeLL.root)
   // binaryTreeLL.inOrderTraverse(binaryTreeLL.root)
        // binaryTreeLL.postOrderTraverse(binaryTreeLL.root)

    binaryTreeLL.levelOrderTraverse()
}