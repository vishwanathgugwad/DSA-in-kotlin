package com.example.dsa.graphs

fun main(){

    var graphList = ArrayList<GraphListNode>()
    graphList.add(GraphListNode("A",0))
    graphList.add(GraphListNode("B",1))
    graphList.add(GraphListNode("C",2))
    graphList.add(GraphListNode("D",3))
    graphList.add(GraphListNode("E",4))

    val g = AdjacencyList(graphList)
    g.addUndirectedEdge(0,1)
    g.addUndirectedEdge(0,2)
    g.addUndirectedEdge(0,3)
    g.addUndirectedEdge(1,4)
    g.addUndirectedEdge(2,3)
    g.addUndirectedEdge(3,4)

   println(g.displayAdjacencyList())
}


class AdjacencyList{
    var graphList = emptyList<GraphListNode>()

    constructor(list: ArrayList<GraphListNode>){
        this.graphList = list
    }
    fun addUndirectedEdge(i : Int , j : Int){
        val first = graphList[i]
        val second = graphList[j]
        first.neighbors.add(second)
        second.neighbors.add(first)
    }

    fun displayAdjacencyList() : String{
        var str = StringBuilder()
        for (i in graphList.withIndex()){
            str.append("${i.value.name}: ")
            with(i.value.neighbors){
                for (j in 0 until this.size){
                    if (this[j] == this[this.size-1]){
                        str.append("${this[j].name} ")
                    }else{
                        str.append("${this[j].name} ->")
                    }
                }
            }

            str.append("\n")
        }

        return str.toString()

    }


}

class GraphListNode{
    var name : String
    var idx : Int
    var neighbors  = ArrayList<GraphListNode>()

    constructor(name : String , index : Int){
        this.name = name
        this.idx = index
    }
}