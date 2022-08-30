package com.example.dsa.trees.binarytree

import com.example.dsa.circularqueue.usingLL.QueueLinkedList
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
        if (root!=null)
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
    fun searchValue(value : String) : String {
        var result = "Failed"
        var queue : Queue<BinaryNode> = LinkedList()
        if (root == null) return result
        queue.add(root)
        if (root?.value.equals(value)) return "Success"
        while (!queue.isEmpty()) {
            var presentNode = queue.remove()
            if (presentNode.value.equals(value)) return "success"
            if (presentNode.left != null) {
                queue.add(presentNode.left)
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right)
            }
        }
        return result
    }

    fun insertNode(value : String){
        var newNode = BinaryNode()
        newNode.value = value
        var queue : Queue<BinaryNode> = LinkedList()
        if (root == null) {
            val rootNode = BinaryNode()
            rootNode.value = value
            root = rootNode
            return
        }
        queue.add(root)
        while (!queue.isEmpty()){
            var presentNode = queue.remove()
            if (presentNode.left!=null){
                queue.add(presentNode.left)
            }else{
                presentNode.left = newNode
                break
            }
            if (presentNode.right!=null){
                queue.add(presentNode.right)
            }else{
                presentNode.right = newNode
                break
            }
        }

    }
    fun deepestNode() : BinaryNode {
        var queue : Queue<BinaryNode> = LinkedList()
        queue.add(root)
        var presentNode = BinaryNode()
        while (!queue.isEmpty()){
            presentNode = queue.remove()
            if (presentNode.left!=null){
                queue.add(presentNode.left)
            }
            if (presentNode.right!=null){
                queue.add(presentNode.right)
            }

        }
        return presentNode
    }
    fun deleteDeepestNode(){
        var queue : Queue<BinaryNode> = LinkedList()
        queue.add(root)
        var presentNode: BinaryNode? = null
        var previousNode: BinaryNode? = null
        while (!queue.isEmpty()){
            previousNode = presentNode
            presentNode = queue.remove()
            if (presentNode.left == null){
                previousNode?.right = null
                return
            }else if (presentNode.right == null){
                presentNode.left = null
                return
            }else{
                queue.add(presentNode.left)
                queue.add(presentNode.right)
            }
        }
    }
     fun deleteAnyNode(value : String){
         var queue : Queue<BinaryNode> = LinkedList()
         queue.add(root)
         var presentNode : BinaryNode
         var deepestNode = deepestNode()
             while (!queue.isEmpty()){
              presentNode = queue.remove()
             if (presentNode.value.equals(value)){
                 presentNode.value = deepestNode.value
                 deleteDeepestNode()
                 return
             }else
                 if (presentNode.left!=null){
                     queue.add(presentNode.left)
                 }
                 if (presentNode.right!=null){
                     queue.add(presentNode.right)
                 }
         }

    }
    fun deleteEntireTree(){
        root = null
        println("Tree deleted successfully ...")
    }
}

fun main(){


    val binaryTreeLL = BinaryTreeLL()
    binaryTreeLL.insertNode("N1")
    binaryTreeLL.insertNode("N2")
    binaryTreeLL.insertNode("N3")
    binaryTreeLL.insertNode("N4")
    binaryTreeLL.insertNode("N5")
    binaryTreeLL.insertNode("N6")
    binaryTreeLL.insertNode("N7")
    binaryTreeLL.insertNode("N8")
    binaryTreeLL.insertNode("N9")

    binaryTreeLL.perOrderTraverse(binaryTreeLL.root)
   // binaryTreeLL.inOrderTraverse(binaryTreeLL.root)
        // binaryTreeLL.postOrderTraverse(binaryTreeLL.root)


//    binaryTreeLL.levelOrderTraverse()
//    println()
//    println(binaryTreeLL.deepestNode().value)
//    binaryTreeLL.deleteDeepestNode()
//    println(binaryTreeLL.deepestNode().value)
//    binaryTreeLL.deleteDeepestNode()
//    println(binaryTreeLL.deepestNode().value)
//    binaryTreeLL.insertNode("N123")
//    println(binaryTreeLL.deepestNode().value)
//    binaryTreeLL.levelOrderTraverse()
//    binaryTreeLL.deleteAnyNode("N4")
//    println()
//    binaryTreeLL.levelOrderTraverse()
//    println()
//    binaryTreeLL.deleteEntireTree()
//    binaryTreeLL.levelOrderTraverse()

}