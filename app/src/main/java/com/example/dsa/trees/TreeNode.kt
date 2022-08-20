package com.example.dsa.trees



class TreeNode {

    var data : String
    var children : ArrayList<TreeNode>

    constructor(nodeData : String){
        data = nodeData
        children = ArrayList()
    }


    fun addChildren(node : TreeNode){
        children.add(node)
    }

    fun print(level : Int) : String{
        var ret : String
        ret = " ".repeat(level)+data+"\n"
        for (node in children){
            ret = ret + node.print(level+1)
        }
        return ret

    }
}

fun main(){
    val root = TreeNode("Drinks")
    val hot = TreeNode("Hot")
    val cold = TreeNode("Cold")
    root.addChildren(hot)
    root.addChildren(cold)
    var tea = TreeNode("Tea")
    var coffee = TreeNode("coffee")
    var coldDrink = TreeNode("fanta")
    var beer = TreeNode("beer")
    cold.addChildren(coldDrink)
    cold.addChildren(beer)
    hot.addChildren(tea)
    hot.addChildren(coffee)
    println(root.print(0))

}