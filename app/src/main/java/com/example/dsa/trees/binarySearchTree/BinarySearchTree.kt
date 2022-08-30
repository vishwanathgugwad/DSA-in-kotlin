package com.example.dsa.trees.binarySearchTree

import java.util.*


class BinarySearchTree {

    var root: TreeNode?


    constructor() {
        root = null
    }

    fun insert(value: Int) {
        root = insertValue(root, value)
    }

    private fun insertValue(currentNode: TreeNode?, value: Int): TreeNode {
        if (currentNode == null) {
            var node = TreeNode()
            node.value = value
            println("Insearted")
            return node
        } else if (value < currentNode!!.value!!) {
            currentNode.left = insertValue(currentNode.left, value)
            return currentNode
        } else {
            currentNode.right = insertValue(currentNode.right, value)
            return currentNode
        }

    }

    fun preOrderTraverse(node: TreeNode?) {
        if (node == null) {
            return
        }
        print(node.value)
        print(" ")
        preOrderTraverse(node.left)
        preOrderTraverse(node.right)
    }

    fun inOrderTraverse(node: TreeNode?) {
        if (node == null) {
            return
        }
        inOrderTraverse(node.left)
        print(node.value)
        print(" ")
        inOrderTraverse(node.right)
    }

    fun postOrderTraverse(node: TreeNode?) {
        if (node == null) {
            return
        }
        postOrderTraverse(node.left)
        postOrderTraverse(node.right)
        print(node.value)
        print(" ")
    }

    fun levelOrderTraverse() {
        var queue: Queue<TreeNode> = LinkedList()
        if (root == null) {
            return
        }
        queue.add(root)
        while (!queue.isEmpty()) {
            var presentNode = queue.remove()
            print(presentNode.value)
            print(" ")
            if (presentNode.left != null) {
                queue.add(presentNode.left)
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right)
            }
        }
    }

    fun search(value: Int): String {
        var queue: Queue<TreeNode> = LinkedList()
        if (root == null) {
            return "empty"
        }
        queue.add(root)
        while (!queue.isEmpty()) {
            var presentNode = queue.remove()
            if (presentNode.value == value) {
                return "success";
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left)
                }
                if (presentNode.right != null) {
                    queue.add(presentNode.right)
                }
            }

        }
        return "Not found"
    }

    //minimum node
    fun minNode(node: TreeNode?): TreeNode? {
        return if (node?.left == null) {
            node
        } else {
            minNode(node.left)
        }
    }
    //node deletion
    fun deleteNode(root : TreeNode? , value : Int ) : TreeNode? {
        var inRoot = root
        if (inRoot == null) {
            println("Value not found")
            return null
        }
        if (value < inRoot.value!!) {
            inRoot.left = deleteNode(inRoot.left, value)
        } else if (value > inRoot.value!!) {
            inRoot.right = deleteNode(inRoot.right, value)
        } else {
            if (inRoot.left != null && inRoot.right != null) {
                var temp = inRoot
                var minNode = minNode(temp.right)
                inRoot.value = minNode?.value
                inRoot.right = deleteNode(inRoot.right, minNode?.value!!)
            }else if (inRoot.left != null){
                inRoot = inRoot.left
        }else if (inRoot.right != null){
                 inRoot = inRoot.right
        }else{
            inRoot = null
        }
    }
        return inRoot
    }

}
fun main(){

    val bt = BinarySearchTree()
    bt.insert(70)
    bt.insert(50)
    bt.insert(90)
    bt.insert(30)
    bt.insert(60)
    bt.insert(80)
    bt.insert(100)
    bt.insert(95)
//    bt.insert(40)
//    bt.preOrderTraverse(bt.root)
//    println("\n")
//    bt.inOrderTraverse(bt.root)
//    println("\n")
//    bt.postOrderTraverse(bt.root)
//    println("\n")
    bt.levelOrderTraverse()
    println("\n")
    println(bt.minNode(bt.root)?.value)
    bt.deleteNode(root = bt.root,90)
    bt.levelOrderTraverse()

}
